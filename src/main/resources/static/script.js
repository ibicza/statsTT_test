const uploadButton = document.getElementById('uploadButton');
const jsonFileInput = document.getElementById('jsonFileInput');
const progressContainer = document.getElementById('progressContainer');
const progressInner = document.getElementById('progressInner');
const progressText = document.getElementById('progressText');

//translate
const translations = {
    en: {
        greeting: "Hello!",
        viewComments: "View Comments",
        viewSearchHistory: "View Search History",
        viewUsedHashtags: "View Hashtags",
    },
    ru: {
        greeting: "Привет!",
        viewComments: "Посмотреть комментарии",
        viewSearchHistory: "История поиска",
        viewUsedHashtags: "Хэштеги",
    },
    ch: {
        greeting: "¡Hola!",
        viewComments: "Ver comentarios",
        viewSearchHistory: "Historial de búsqueda",
        viewUsedHashtags: "Hashtags",
    },
};


// Заготовка данных вместо ответа сервера
const fakeServerResponse = {
    username: "john_doe", // Имя пользователя
    countVideosWatched: 120, // Количество просмотренных видео
    countVideoLiked: 45, // Количество понравившихся видео
    countVideoShared: 30, // Количество видео, которыми поделились
    countFriendsVideosLiked: 25, // Количество понравившихся видео друзей
    countComments: 60, // Количество комментариев
    countUsedHashtags: 15, // Количество использованных хэштегов
    countLivesWatched: 10, // Количество просмотренных трансляций
    countLoginHistory: 50, // Количество входов в систему

    mostUsedEmojis: "😂❤️🔥", // Самые часто используемые эмодзи
    usedHashTags: ["#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding","#funny", "#music", "#coding"], // Использованные хэштеги
    shearList: ["Video 1", "Video 2", "Video 3"], // Список видео, которыми поделились
    commentsWrite: [
        "Great video!",
        "Amazing content!",
        "Keep it up!",
    ], // Список комментариев
};
// Обработка кнопки загрузки
uploadButton.addEventListener('click', () => {
    try {
        displayStats(fakeServerResponse); // Используем заранее определённые данные
        checkScreenSize(fakeServerResponse); // Дополнительно, если нужно
    } catch (error) {
        console.error("Ошибка при вызове displayStats:", error);
    }
    // jsonFileInput.click(); // Имитация клика на input
});

// Обработка выбора файла
jsonFileInput.addEventListener('change', async (event) => {
    const file = event.target.files[0];
    if (file) {
        // Проверяем расширение файла
        const fileExtension = file.name.split('.').pop().toLowerCase();
        if (fileExtension !== 'json') {
            alert('Ошибка: можно загружать только файлы с расширением .json');
            event.target.value = ''; // Сбросить выбранный файл
            return;
        }

        const expectedStart = `{
  "Activity": {
    "Favorite Effects": {
      "FavoriteEffectsList":`;

        try {
            const isValid = await validateJSONStartSync(file, expectedStart);
            if (!isValid) {
                alert("Ошибка: JSON не соответствует ожидаемой начальной структуре!");
                event.target.value = ''; // Сбросить выбранный файл
                return;
            }
        } catch (error) {
            console.error(error.message);
            return;
        }
        document.getElementById("upload-section").style.marginBottom = '5px';
        // Отображаем прогресс-бар
        progressContainer.style.display = "block";


        const formData = new FormData();
        formData.append('file', file);

        const xhr = new XMLHttpRequest();

        // Обновляем прогресс-бар
        xhr.upload.addEventListener('progress', (e) => {
            if (e.lengthComputable) {
                const percentComplete = Math.round((e.loaded / e.total) * 100);
                progressInner.style.width = percentComplete + '%';
                progressText.textContent = percentComplete + '%';
            }
        });

        // Обработка завершения загрузки
        xhr.addEventListener('load', async () => {
            if (xhr.status === 200) {
                progressContainer.style.display = "none";
                progressInner.style.width = "0%";
                progressText.textContent = "0%";

                try {
                    const stats = JSON.parse(xhr.responseText);
                    displayStats(stats);
                    checkScreenSize(); // Проверить при загрузке страницы
                } catch (error) {
                    console.error('Ошибка при обработке ответа сервера:', error);
                }
            } else {
                alert(`Ошибка: ${xhr.status} ${xhr.statusText}`);
            }
        });

        // Обработка ошибок
        xhr.addEventListener('error', () => {
            alert('Ошибка при загрузке файла.');
            progressContainer.style.display = "none";
            progressInner.style.width = "0%";
            progressText.textContent = "0%";
        });

        // Отправка файла на сервер
        xhr.open('POST', 'http://localhost:8080/api/upload');
        xhr.send(formData);
    }
});

function validateJSONStartSync(file, expectedStart) {
    return new Promise((resolve, reject) => {
        const reader = new FileReader();

        reader.onload = (e) => {
            const firstChunk = e.target.result;
            // Проверяем, начинается ли файл с ожидаемой строки
            if (firstChunk.trim().startsWith(expectedStart)) {
                resolve(true); // JSON валиден
            } else {
                resolve(false); // JSON не соответствует
            }
        };

        reader.onerror = () => {
            reject(new Error("Ошибка чтения файла!"));
        };

        // Читаем первые 512 байт файла
        reader.readAsText(file.slice(0, 512));
    });
}


function displayStats(stats) {
    // Очистить начальную страницу
    document.body.innerHTML = '';

    // Вставить новую страницу со слайдами
    document.body.innerHTML = `
    <link rel="preload" href="backgrounds/VideoShared.svg" as="image">
    <link rel="preload" href="backgrounds/VideoLiked.svg" as="image">
    <link rel="preload" href="backgrounds/UsedHashtags.svg" as="image">
    <link rel="preload" href="backgrounds/TotalTimeSpent.svg" as="image">
    <link rel="preload" href="backgrounds/TotalStats.svg" as="image">
    <link rel="preload" href="backgrounds/MostUsedEmojis.svg" as="image">
    <link rel="preload" href="backgrounds/LoginHistory.svg" as="image">
    <link rel="preload" href="backgrounds/LivesWatched.svg" as="image">
    <link rel="preload" href="backgrounds/FriendsVideoLiked.svg" as="image">
    <link rel="preload" href="backgrounds/Comments.svg" as="image">
    <div class="background-overlay background-overlay-1"></div>
    <div class="background-overlay background-overlay-2"></div>
    <div class="content">
        <div class="header">
        <h1 id="headerH1">Your Time on TikTok!</h1>
        <p  id="headerP">${stats.username}'s stats</p>
        </div>
        <div class="stats-page">
            <div class="stats-header">
                <h2>${stats.username}'s <br/> Personalized Stats</h2>
                <button id="backButton">Back</button>
            </div>
            <div id="slideshow" class="slideshow">
                <div class="stat-card" id="slide1">
                    <h3>Video watched</h3>
                    <p id="stat1">0</p>
                </div>
                <div class="stat-card" id="slide2">
                    <h3>Video Liked</h3>
                    <p id="stat2">0</p>
                </div>
                <div class="stat-card" id="slide3">
                    <h3>Video Shared</h3>
                    <p id="stat3">0</p>
                </div>
                <div class="stat-card" id="slide4">
                    <h3>Friends' Videos Liked</h3>
                    <p id="stat4">0</p>
                </div>
                <div class="stat-card" id="slide5">
                    <h3>Comments</h3>
                    <p id="stat5">0</p>
                </div>
                <div class="stat-card" id="slide6">
                    <h3>Used Hashtags</h3>
                    <p id="stat6">0</p>
                </div>
                <div class="stat-card" id="slide7">
                    <h3>Lives Watched</h3>
                    <p id="stat7">0</p>
                </div>
                <div class="stat-card" id="slide8">
                    <h3>Login History</h3>
                    <p id="stat8">0</p>
                </div>
                <div class="stat-card" id="slide9">
                    <h3>Total spent time in minutes</h3>
                    <p id="stat9">0</p>
                </div>
                <div class="stat-card" id="slide10">
                    <h3>Total spent time in hours</h3>
                    <p id="stat10">0</p>
                    <p id="stat10Text">It's too long time...</p>
                </div>
                <div class="stat-card" id="slide11">
                    <h3>Most Used Emojis</h3>
                    <p id="stat11">${stats.mostUsedEmojis}</p>
                </div>
            </div>
            <div class="final-text" id="finalText" style="display: none;">
                <h2>Here are your detailed stats, we hope you find them interesting!</h2>
                <ul class="stats-list" id="statsDetails"></ul>
                <div class="final-buttons">
                    <button id="viewCommentsBtn">View Comments</button>
                    <button id="viewSearchHistoryBtn">Search History</button>
                    <button id="viewUsedHashtagsBtn">View Hashtags</button>
                </div>
            </div>
        </div>
        
            <!-- Всплывающее окно для комментариев -->
        <div id="commentsModal" class="modal" style="display: none;">
            <div class="modal-content">
                <h3>Comments</h3>
                <div id="commentsList" class="scrollable-list"></div>
                <button id="closeCommentsModal">Close</button>
            </div>
        </div>
    
        <!-- Всплывающее окно для истории поиска -->
        <div id="searchHistoryModal" class="modal" style="display: none;">
            <div class="modal-content">
                <h3>Search History</h3>
                <div id="searchHistoryList" class="scrollable-list"></div>
                <button id="closeSearchHistoryModal">Close</button>
            </div>
        </div>
        
        <!-- Всплывающее окно для истории хэштэгов -->
        <div id="searchUsedHashtagsModal" class="modal" style="display: none;">
            <div class="modal-content">
                <h3>Hashtags</h3>
                <div id="searchUsedHashtagsList" class="scrollable-list"></div>
                <button id="closeUsedHashtagsModal">Close</button>
            </div>
        </div>
        <footer class = "footer">
        <p id="footer">&copy; 2024 Ibicza\`s App. All rights reserved.</p>
        </footer>
    </div>
    
    `;



    // Назад к главной
    document.getElementById('backButton').addEventListener('click', () => {
        window.location.reload();
    });



    // Логика слайдшоу
    const slides = document.querySelectorAll('.stat-card');
    const finalText = document.getElementById('finalText');
    const statsDetails = document.getElementById('statsDetails');
    const allStats = `
      <li><span>• Video Watched:</span> ${stats.countVideosWatched || '0'}</li>
      <li><span>• Video Liked:</span> ${stats.countVideoLiked || '0'}</li>
      <li><span>• Video Shared:</span> ${stats.countVideoShared || '0'}</li>
      <li><span>• Friends' Videos Liked:</span> ${stats.countFriendsVideosLiked || '0'}</li>
      <li><span>• Comments:</span> ${stats.countComments || '0'}</li>
      <li><span>• Used Hashtags:</span> ${stats.countUsedHashtags || '0'}</li>
      <li><span>• Lives Watched:</span> ${stats.countLivesWatched || '0'}</li>
      <li><span>• Login History:</span> ${stats.countLoginHistory || '0'}</li>
      <li><span>• Most Used Emojis:</span><br> ${stats.mostUsedEmojis || 'No Emojis :('}</li>
      <li><span>• Total Time Spent:</span> ${Math.round(stats.countVideosWatched * 20 / 60 /60 / 24) + ' Days' || 'No Data :('}</li>
    `;

    document.getElementById("stat10Text").textContent = getText();

    const animatedStats = [
        { id: 'stat1', value: stats.countVideosWatched || 0 },
        { id: 'stat2', value: stats.countVideoLiked || 0 },
        { id: 'stat3', value: stats.countVideoShared || 0 },
        { id: 'stat4', value: stats.countFriendsVideosLiked || 0 },
        { id: 'stat5', value: stats.countComments || 0 },
        { id: 'stat6', value: stats.countUsedHashtags || 0 },
        { id: 'stat7', value: stats.countLivesWatched || 0 },
        { id: 'stat8', value: stats.countLoginHistory || 0 },
        { id: 'stat9', value: Math.round(stats.countVideosWatched * 20 / 60).toFixed() || '0' },
        { id: 'stat10', value: Math.round(stats.countVideosWatched * 20 / 60 / 60).toFixed() || '0' }
    ];

    //2одинаковых фона ибо не был отрисован фон под stat10
    const gradients = [
        'backgrounds/VideoWatched.svg',
        'backgrounds/VideoLiked.svg',
        'backgrounds/VideoShared.svg',
        'backgrounds/FriendsVideoLiked.svg',
        'backgrounds/Comments.svg',
        'backgrounds/UsedHashtags.svg',
        'backgrounds/LivesWatched.svg',
        'backgrounds/LoginHistory.svg',
        'backgrounds/TotalTimeSpent.svg',
        'backgrounds/FriendsVideoLiked.svg',
        'backgrounds/MostUsedEmojis.svg',
        'backgrounds/TotalStats.svg'
    ];

    function getText(){
        const num = stats.countVideosWatched * 20 / 60 / 60 / 24;
        if (num < 5){
            return getRandomText('Лёгкий перекус контентом. Ты ещё нормальный', 'Твоя жизнь пока не превратилась в бесконечный скролл.');
        } else
        if (num < 10){
            return getRandomText('Ну, что-то ты там уже подсел.', 'Твой палец по экрану двигается быстрее, чем мысли.');
        } else
        if (num < 15){
            return getRandomText('Границы между реальностью и тиктоком начали размываться?', 'Ты мог выучить язык, но выбрал выучить тренды. Гений!');
        } else
        if (num < 20){
            return getRandomText('Пора уже сделать перерыв. Хотя бы на еду.', 'Твои мечты умерли быстрее, чем ты смог сказать "For You Page"');
        } else
        if (num < 25){
            return getRandomText('Ты уже не человек, ты алгоритм с ногами.', 'Мозг уже в аренде у TikTok? Или хотя бы роялти платят?');
        } else
        if (num < 30){
            return getRandomText('Месяц впустую. Это уже диагноз.', 'Ты официально гений пустого времени. Поставь себе памятник из лайков.');
        } else
        if (num < 35){
            return getRandomText('Скоро ты станешь реликтом TikTok — тебя будут включать в архивы', 'Ты застрял в бесконечном тикток-подземелье. Выход есть?');
        } else
        if (num < 40){
            return getRandomText('Ты мог выучить язык, но выбрал выучить тренды. Гений', 'Скоро TikTok предложит тебе гражданство');
        } else
        if (num > 40){
            return getRandomText('Если бы ты это время инвестировал, уже бы виллу купил', 'За это время можно было написать книгу, а ты выучил, как танцуют школьники.');
        } else return 'Think about this...'
    }

    function getRandomText(text1, text2) {
        // Генерируем случайное число 0 или 1
        const randomIndex = Math.floor(Math.random() * 2);

        // Возвращаем строку в зависимости от случайного числа
        return randomIndex === 0 ? text1 : text2;
    }


    let currentSlide = 0;
    let currentBackground = 0; // Отслеживаем текущий фон
    const background1 = document.querySelector('.background-overlay-1');
    const background2 = document.querySelector('.background-overlay-2');

    const changeBackground = (newImage) => {
        const current = currentBackground === 1 ? background1 : background2;
        const next = currentBackground === 1 ? background2 : background1;

        // Устанавливаем новый фон для следующего слоя
        next.style.backgroundImage = `url("${newImage}")`;

        // Плавно показываем новый фон
        next.style.opacity = 1;

        // Прячем текущий фон
        current.style.opacity = 0;

        // Переключаем текущий фон
        currentBackground = currentBackground === 1 ? 2 : 1;
    };

    const changeSlide = () => {
        if (currentSlide > 0) {
            slides[currentSlide - 1].classList.remove('active');
        }

        slides[currentSlide].classList.add('active');

        // Синхронизируем смену фона и слайда
        requestAnimationFrame(() => {
            // Меняем фон с плавной анимацией
            changeBackground(gradients[currentSlide]);
        });


        const stat = animatedStats[currentSlide];
        if (stat) {
            animateValue(stat.id, 0, stat.value, 2000);
        }

        currentSlide++;

        if (currentSlide >= slides.length) {
            clearInterval(slideshowInterval);
            document.querySelector('.slideshow').style.display = 'none';
            statsDetails.innerHTML = allStats;
            if (window.innerWidth <= 440){
                const statsPage = document.querySelector('.stats-page');
                statsPage.style.marginTop = '-5px';
                statsPage.style.width = '323px';
                statsPage.style.height = '683px'
                statsPage.style.padding = '0';
                statsPage.style.backgroundColor = 'rgba(255, 255, 255, 0.5)'
                document.querySelector('.stats-header').remove();
            }
            finalText.style.display = 'block';
            // Финальный фон
            requestAnimationFrame(() => {
                changeBackground(gradients[currentSlide]);
            });
        }
    };

    function animateValue(id, start, end, duration) {
        const obj = document.getElementById(id);
        let startTimestamp = null;
        const step = (timestamp) => {
            if (!startTimestamp) startTimestamp = timestamp;
            const progress = Math.min((timestamp - startTimestamp) / duration, 1);
            obj.textContent = Math.floor(progress * (end - start) + start).toFixed();
            if (progress < 1) {
                window.requestAnimationFrame(step);
            }
        };
        window.requestAnimationFrame(step);
    }

    const slideshowInterval = setInterval(changeSlide, 1000);

    // Открытие модального окна с комментариями
    document.getElementById('viewCommentsBtn').addEventListener('click', () => {
        console.log("есть контакт открываю комментарии")
        const commentsModal = document.getElementById('commentsModal');
        const commentsList = document.getElementById('commentsList');

        // Наполним список комментариями
        commentsList.innerHTML = stats.commentsWrite.map(comment => `<p>${comment}</p>`).join('');

        commentsModal.style.display = 'block';
    });

    // Открытие модального окна с историей поиска
    document.getElementById('viewSearchHistoryBtn').addEventListener('click', () => {
        const searchHistoryModal = document.getElementById('searchHistoryModal');
        const searchHistoryList = document.getElementById('searchHistoryList');

        // Наполним список истории поиска
        searchHistoryList.innerHTML = stats.shearList.map(search => `<p>${search}</p>`).join('');

        searchHistoryModal.style.display = 'block';
    });

    // Открытие модального окна с историей хэштэгов
    document.getElementById('viewUsedHashtagsBtn').addEventListener('click', () => {
        const searchUsedHashtagsModal = document.getElementById('searchUsedHashtagsModal');
        const searchUsedHashtagsList = document.getElementById('searchUsedHashtagsList');

        // Наполним список истории поиска
        searchUsedHashtagsList.innerHTML = stats.usedHashTags.map(search => `<p>${search}</p>`).join('');

        searchUsedHashtagsModal.style.display = 'block';
    });

    // Закрытие модального окна с комментариями
    document.getElementById('closeCommentsModal').addEventListener('click', () => {
        document.getElementById('commentsModal').style.display = 'none';
    });

    // Закрытие модального окна с историей поиска
    document.getElementById('closeSearchHistoryModal').addEventListener('click', () => {
        document.getElementById('searchHistoryModal').style.display = 'none';
    });

    // Закрытие модального окна с историей хэштэгов
    document.getElementById('closeUsedHashtagsModal').addEventListener('click', () => {
        document.getElementById('searchUsedHashtagsModal').style.display = 'none';
    });

}

//адаптация
function checkScreenSize(stats) {
    const width = window.innerWidth;
    const header = document.querySelector(".header");
    const headerP = document.querySelector("#headerP");

    if (width <= 440) {
        // Удаляем h1
        const headerH1 = document.getElementById('headerH1');
        const backButton = document.getElementById('backButton');
        if (headerH1) {
            headerH1.remove();
            backButton.remove();
        }

        // Меняем стиль header
        header.style.height = '130px';
        header.style.display = "flex"; // Включаем flexbox
        header.style.alignItems = "center"; // Центрируем элементы по вертикали
        header.style.justifyContent = "flex-end"; // Разделяем текст и кнопку
        header.style.padding = "0";

        // Меняем стиль headerP
        headerP.style.marginTop = '75px';
        headerP.style.marginBottom = '0px';
        headerP.style.marginLeft = '60px';
        headerP.style.marginRight = '0px';
        headerP.style.fontSize = '24px';
        headerP.style.height = '48px';
        headerP.style.width = '100%';
        headerP.style.textAlign = 'center'; // Центрируем текст по горизонтали
        headerP.style.lineHeight = '48px'; // Центрируем текст по вертикали в пределах блока


        // Проверяем, есть ли кнопка, чтобы не добавлять дубликаты
        if (!document.getElementById('refresh-button')) {
            // Создаём кнопку
            const refreshButton = document.createElement("button");
            refreshButton.id = "refresh-button";
            refreshButton.innerHTML = `
                <svg width="48" height="48" viewBox="0 0 48 48" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <circle cx="24" cy="24" r="24" fill="black"/>
                    <path d="M37.7153 22.8604C37.3503 21.2476 36.6339 19.716 35.6075 18.3538C34.602 17.0118 33.3186 15.8568 31.8275 14.9518C30.3121 14.0313 28.6109 13.3868 26.8202 13.0548C25.8793 12.8828 24.9212 12.7983 23.9611 12.8028V10L17.7778 14.2L23.9611 18.4V15.6028C24.714 15.6 25.4669 15.6644 26.1933 15.7988C27.5851 16.0569 28.9073 16.5577 30.0853 17.273C31.2465 17.9774 32.2458 18.8768 33.0284 19.9218C34.2436 21.5392 34.8916 23.4475 34.8889 25.4C34.8899 26.7103 34.599 28.0076 34.0333 29.215C33.7598 29.7972 33.4243 30.3542 33.0315 30.8782C32.6397 31.4005 32.1927 31.8877 31.6969 32.3328C30.191 33.6853 28.2794 34.6131 26.1964 35.0026C24.7479 35.2669 23.2552 35.2669 21.8067 35.0026C20.4142 34.7442 19.0915 34.2429 17.9131 33.527C16.7534 32.8231 15.7552 31.9248 14.9731 30.881C13.7594 29.2618 13.111 27.3532 13.1111 25.4H10C9.99976 27.9114 10.8334 30.3656 12.394 32.4476C13.4019 33.7861 14.6837 34.9397 16.1709 35.8468C18.4818 37.2544 21.2095 38.0046 24 38C24.9478 38.0008 25.8932 37.9149 26.8218 37.7438C28.612 37.4116 30.3125 36.7671 31.8275 35.8468C32.5709 35.3948 33.2642 34.8796 33.898 34.3082C34.5335 33.7374 35.1065 33.1129 35.6091 32.4434C37.172 30.3641 38.005 27.9103 38 25.4C38.0009 24.547 37.9055 23.6961 37.7153 22.8604Z" fill="#F8F8F8"/>
                </svg>
            `;

            // Стили для кнопки
            refreshButton.style.marginTop = '75px';
            refreshButton.style.background = "none";
            refreshButton.style.border = "none";
            refreshButton.style.cursor = "pointer";
            refreshButton.style.padding = "8px";
            refreshButton.style.borderRadius = "50%";
            refreshButton.style.display = "flex";
            refreshButton.style.alignItems = "center";
            refreshButton.style.justifyContent = "center";
            refreshButton.style.transition = "background 0.3s";


            // Добавляем обработчик нажатия
            refreshButton.addEventListener("click", () => {
                console.log("Обновление данных..."); // Здесь можно вызвать свою функцию обновления
                window.location.reload();
            });

            // Вставляем кнопку рядом с headerP
            header.appendChild(refreshButton);

            //меняем кнопки на final-text
            const finalButtons = document.querySelector('.final-buttons');

            // Удаляем старые элементы
            finalButtons.innerHTML = '';
            finalButtons.innerHTML = `
                <!-- Кнопка "View Search History" по центру -->
                <button id="viewSearchHistoryBtn">SEARCH HISTORY</button>

                <!-- Контейнер для кнопок "View Comments" и "View Hashtags" -->
                <div class="button-row">
                    <button id="viewCommentsBtn">COMMENTS</button>
                    <button id="viewUsedHashtagsBtn">HASHTAGS</button>
                </div>
            `

        }
    }

    // Открытие модального окна с комментариями
    document.getElementById('viewCommentsBtn').addEventListener('click', () => {
        const commentsModal = document.getElementById('commentsModal');
        const commentsList = document.getElementById('commentsList');

        // Наполним список комментариями
        commentsList.innerHTML = stats.commentsWrite.map(comment => `<p>${comment}</p>`).join('');

        commentsModal.style.display = 'block';
    });

    // Открытие модального окна с историей поиска
    document.getElementById('viewSearchHistoryBtn').addEventListener('click', () => {
        const searchHistoryModal = document.getElementById('searchHistoryModal');
        const searchHistoryList = document.getElementById('searchHistoryList');

        // Наполним список истории поиска
        searchHistoryList.innerHTML = stats.shearList.map(search => `<p>${search}</p>`).join('');

        searchHistoryModal.style.display = 'block';
    });

    // Открытие модального окна с историей хэштэгов
    document.getElementById('viewUsedHashtagsBtn').addEventListener('click', () => {
        const searchUsedHashtagsModal = document.getElementById('searchUsedHashtagsModal');
        const searchUsedHashtagsList = document.getElementById('searchUsedHashtagsList');

        // Наполним список истории поиска
        searchUsedHashtagsList.innerHTML = stats.usedHashTags.map(search => `<p>${search}</p>`).join('');

        searchUsedHashtagsModal.style.display = 'block';
    });

    // Закрытие модального окна с комментариями
    document.getElementById('closeCommentsModal').addEventListener('click', () => {
        document.getElementById('commentsModal').style.display = 'none';
    });

    // Закрытие модального окна с историей поиска
    document.getElementById('closeSearchHistoryModal').addEventListener('click', () => {
        document.getElementById('searchHistoryModal').style.display = 'none';
    });

    // Закрытие модального окна с историей хэштэгов
    document.getElementById('closeUsedHashtagsModal').addEventListener('click', () => {
        document.getElementById('searchUsedHashtagsModal').style.display = 'none';
    });
}

window.addEventListener("resize", checkScreenSize); // Отслеживать изменение размеров

