package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class GoLiveSettingsSettingsMap {
    private String allowAgenciesToFindAndInviteYou;
    private String allowOthersToInviteYouToCoHostInLive;
    private String allowPeopleToSendAndReceiveCommentsDuringYourLive;
    private String allowSuggestedLiveHostsToInviteYouToCoHostInLive;
    private String allowViewersToRequestToGoLiveWithYou;
    private String allowViewersToSeeAndSendQuestionsAndAnswersInYourLive;
    private String allowViewersToSendYouGiftsDuringYourLive;
    private List<Object> hideCommentsThatContainTheFollowingKeywordsFromYourLive;
    private String hidePotentialSpamOrOffensiveCommentsFromYourLive;
    private List<Object> peopleYouAssignedToModerateYourLive;
    private String showYourUsernameAndGiftInformationInFeaturesWithRankingLists;

    @JsonProperty("Allow agencies to find and invite you")
    public String getAllowAgenciesToFindAndInviteYou() { return allowAgenciesToFindAndInviteYou; }
    @JsonProperty("Allow agencies to find and invite you")
    public void setAllowAgenciesToFindAndInviteYou(String value) { this.allowAgenciesToFindAndInviteYou = value; }

    @JsonProperty("Allow others to invite you to co-host in LIVE")
    public String getAllowOthersToInviteYouToCoHostInLive() { return allowOthersToInviteYouToCoHostInLive; }
    @JsonProperty("Allow others to invite you to co-host in LIVE")
    public void setAllowOthersToInviteYouToCoHostInLive(String value) { this.allowOthersToInviteYouToCoHostInLive = value; }

    @JsonProperty("Allow people to send and receive comments during your LIVE")
    public String getAllowPeopleToSendAndReceiveCommentsDuringYourLive() { return allowPeopleToSendAndReceiveCommentsDuringYourLive; }
    @JsonProperty("Allow people to send and receive comments during your LIVE")
    public void setAllowPeopleToSendAndReceiveCommentsDuringYourLive(String value) { this.allowPeopleToSendAndReceiveCommentsDuringYourLive = value; }

    @JsonProperty("Allow suggested LIVE hosts to invite you to co-host in LIVE")
    public String getAllowSuggestedLiveHostsToInviteYouToCoHostInLive() { return allowSuggestedLiveHostsToInviteYouToCoHostInLive; }
    @JsonProperty("Allow suggested LIVE hosts to invite you to co-host in LIVE")
    public void setAllowSuggestedLiveHostsToInviteYouToCoHostInLive(String value) { this.allowSuggestedLiveHostsToInviteYouToCoHostInLive = value; }

    @JsonProperty("Allow viewers to request to go LIVE with you")
    public String getAllowViewersToRequestToGoLiveWithYou() { return allowViewersToRequestToGoLiveWithYou; }
    @JsonProperty("Allow viewers to request to go LIVE with you")
    public void setAllowViewersToRequestToGoLiveWithYou(String value) { this.allowViewersToRequestToGoLiveWithYou = value; }

    @JsonProperty("Allow viewers to see and send questions and answers in your LIVE")
    public String getAllowViewersToSeeAndSendQuestionsAndAnswersInYourLive() { return allowViewersToSeeAndSendQuestionsAndAnswersInYourLive; }
    @JsonProperty("Allow viewers to see and send questions and answers in your LIVE")
    public void setAllowViewersToSeeAndSendQuestionsAndAnswersInYourLive(String value) { this.allowViewersToSeeAndSendQuestionsAndAnswersInYourLive = value; }

    @JsonProperty("Allow viewers to send you gifts during your LIVE")
    public String getAllowViewersToSendYouGiftsDuringYourLive() { return allowViewersToSendYouGiftsDuringYourLive; }
    @JsonProperty("Allow viewers to send you gifts during your LIVE")
    public void setAllowViewersToSendYouGiftsDuringYourLive(String value) { this.allowViewersToSendYouGiftsDuringYourLive = value; }

    @JsonProperty("Hide comments that contain the following keywords from your LIVE")
    public List<Object> getHideCommentsThatContainTheFollowingKeywordsFromYourLive() { return hideCommentsThatContainTheFollowingKeywordsFromYourLive; }
    @JsonProperty("Hide comments that contain the following keywords from your LIVE")
    public void setHideCommentsThatContainTheFollowingKeywordsFromYourLive(List<Object> value) { this.hideCommentsThatContainTheFollowingKeywordsFromYourLive = value; }

    @JsonProperty("Hide potential spam or offensive comments from your LIVE")
    public String getHidePotentialSpamOrOffensiveCommentsFromYourLive() { return hidePotentialSpamOrOffensiveCommentsFromYourLive; }
    @JsonProperty("Hide potential spam or offensive comments from your LIVE")
    public void setHidePotentialSpamOrOffensiveCommentsFromYourLive(String value) { this.hidePotentialSpamOrOffensiveCommentsFromYourLive = value; }

    @JsonProperty("People you assigned to moderate your LIVE")
    public List<Object> getPeopleYouAssignedToModerateYourLive() { return peopleYouAssignedToModerateYourLive; }
    @JsonProperty("People you assigned to moderate your LIVE")
    public void setPeopleYouAssignedToModerateYourLive(List<Object> value) { this.peopleYouAssignedToModerateYourLive = value; }

    @JsonProperty("Show your username and gift information in features with ranking lists")
    public String getShowYourUsernameAndGiftInformationInFeaturesWithRankingLists() { return showYourUsernameAndGiftInformationInFeaturesWithRankingLists; }
    @JsonProperty("Show your username and gift information in features with ranking lists")
    public void setShowYourUsernameAndGiftInformationInFeaturesWithRankingLists(String value) { this.showYourUsernameAndGiftInformationInFeaturesWithRankingLists = value; }
}
