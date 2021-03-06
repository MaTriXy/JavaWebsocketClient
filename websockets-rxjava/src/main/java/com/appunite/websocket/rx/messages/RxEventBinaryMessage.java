/*
 * Copyright (C) 2015 Jacek Marchwicki <jacek.marchwicki@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.appunite.websocket.rx.messages;

import okhttp3.WebSocket;

import java.util.Arrays;

import javax.annotation.Nonnull;

/**
 * Event indicating that binary was returned by server
 */
public class RxEventBinaryMessage extends RxEventBinaryMessageAbs {

    public RxEventBinaryMessage(@Nonnull WebSocket sender, @Nonnull byte[] message) {
        super(sender, message);
    }

    @Override
    public String toString() {
        return "RxEventBinaryMessage{" +
                "message=" + Arrays.toString(message()) +
                '}';
    }
}
