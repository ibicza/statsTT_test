package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
public class AdsAndData {
    private InstantFormAdsResponses instantFormAdsResponses;
    private OffTikTokActivity offTikTokActivity;

    @JsonProperty("Instant Form Ads Responses")
    public InstantFormAdsResponses getInstantFormAdsResponses() { return instantFormAdsResponses; }
    @JsonProperty("Instant Form Ads Responses")
    public void setInstantFormAdsResponses(InstantFormAdsResponses value) { this.instantFormAdsResponses = value; }

    @JsonProperty("Off TikTok Activity")
    public OffTikTokActivity getOffTikTokActivity() { return offTikTokActivity; }
    @JsonProperty("Off TikTok Activity")
    public void setOffTikTokActivity(OffTikTokActivity value) { this.offTikTokActivity = value; }
}
