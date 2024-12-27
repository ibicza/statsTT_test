const uploadButton = document.getElementById('uploadButton');
const jsonFileInput = document.getElementById('jsonFileInput');
const progressContainer = document.getElementById('progressContainer');
const progressInner = document.getElementById('progressInner');
const progressText = document.getElementById('progressText');

// Обработка кнопки загрузки
uploadButton.addEventListener('click', () => {
    jsonFileInput.click(); // Имитация клика на input
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
        xhr.open('POST', 'https://e528-178-120-0-103.ngrok-free.app/api/upload');
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
    <div class="background-overlay background-overlay-1"></div>
    <div class="background-overlay background-overlay-2"></div>
    <div class="content">
        <div class="header">
        <h1>Your Time on TikTok</h1>
        <p>!Text TEXT texT!</p>
        </div>
        <div class="stats-page">
            <div class="stats-header">
                <h2>${stats.username}'s Personalized Stats</h2>
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
                <button id="viewCommentsBtn">View Comments</button>
                <button id="viewSearchHistoryBtn">View Search History</button>
                <button id="viewUsedHashtagsBtn">View Hashtags</button>
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
      <li><span>Video Watched:</span> ${stats.countVideosWatched || '0'}</li>
      <li><span>Video Liked:</span> ${stats.countVideoLiked || '0'}</li>
      <li><span>Video Shared:</span> ${stats.countVideoShared || '0'}</li>
      <li><span>Friends' Videos Liked:</span> ${stats.countFriendsVideosLiked || '0'}</li>
      <li><span>Comments:</span> ${stats.countComments || '0'}</li>
      <li><span>Used Hashtags:</span> ${stats.countUsedHashtags || '0'}</li>
      <li><span>Lives Watched:</span> ${stats.countLivesWatched || '0'}</li>
      <li><span>Login History:</span> ${stats.countLoginHistory || '0'}</li>
      <li><span>Most Used Emojis:</span> ${stats.mostUsedEmojis || 'No Emojis :('}</li>
      <li><span>Total Time Spent:</span> ${Math.round(stats.countVideosWatched * 20 / 60 /60 / 24) + ' Days' || 'No Data :('}</li>
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
        'backgrounds/StartPage.svg',
        'backgrounds/VideoWatched.svg',
        'backgrounds/VideoLiked.svg',
        'backgrounds/VideoShared.svg',
        'backgrounds/FriendsVideoLiked.svg',
        'backgrounds/Comments.svg',
        'backgrounds/UsedHashtags.png',
        'backgrounds/LivesWatched.svg',
        'backgrounds/LoginHistory.svg',
        'backgrounds/TotalTimeSpent.svg',
        'backgrounds/FriendsVideoLiked.svg',
        'backgrounds/MostUsedEmojis.svg',
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
            finalText.style.display = 'block';
            // Финальный фон
            changeBackground('backgrounds/TotalStats.svg');
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

    const slideshowInterval = setInterval(changeSlide, 6000);

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

