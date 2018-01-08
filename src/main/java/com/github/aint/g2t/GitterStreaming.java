package com.github.aint.g2t;

import com.amatkivskiy.gitter.sdk.rx.client.RxGitterStreamingApiClient;
import com.amatkivskiy.gitter.sdk.model.response.message.MessageResponse;

import rx.functions.Action1;
import rx.Observable;

public class GitterStreaming {

    public static void main(String[] args) {
        RxGitterStreamingApiClient client = new RxGitterStreamingApiClient.Builder()
                .withAccountToken("token")
                .build();

        String roomId = "5a528197d73408ce4f86c416";

        client.getRoomMessagesStream(roomId).subscribe(new Action1<MessageResponse>() {
            @Override
            public void call(MessageResponse messageResponse) {
                System.out.println("messageResponse = " + messageResponse.text);
            }
        });
    }

}
