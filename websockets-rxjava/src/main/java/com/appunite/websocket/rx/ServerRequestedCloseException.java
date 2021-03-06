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

package com.appunite.websocket.rx;

import java.io.IOException;

import javax.annotation.Nonnull;

/**
 * Exception indicating that server requested close connection
 */
public class ServerRequestedCloseException extends IOException {

    private final int code;
    @Nonnull
    private final String reason;

    public ServerRequestedCloseException(int code,
                                         @Nonnull String reason) {
        super("Server requested connection to close, code=" + code + ", reason= " + reason);
        this.code = code;
        this.reason = reason;
    }

    /**
     * Code why close requested
     * @return code why close requested
     */
    public int code() {
        return code;
    }

    /**
     * Reason why close requested
     * @return reason why close requested or empty string
     */
    @Nonnull
    public String reason() {
        return reason;
    }

}
