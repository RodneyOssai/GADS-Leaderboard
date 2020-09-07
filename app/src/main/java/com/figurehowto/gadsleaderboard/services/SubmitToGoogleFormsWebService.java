package com.figurehowto.gadsleaderboard.services;

import androidx.annotation.Nullable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SubmitToGoogleFormsWebService {
        @POST("1FAIpQLSdg3NM40JTT_Fw3yi5Ykof4jjvWw4xfrDoQC8EA_oV_Fy6WZA/formResponse")
        @FormUrlEncoded
        @Nullable
        Call<Void> submitProject(
                @Field("entry.1819075771") @Nullable String firstName,
                @Field("entry.1005181985") @Nullable String lastName,
                @Field("entry.336305801") @Nullable String githubLink,
                @Field("emailAddress") @Nullable String emailAddress);

}
