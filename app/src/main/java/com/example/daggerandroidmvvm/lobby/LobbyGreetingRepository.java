/*
 * Copyright (c) 2019. Adit Chauhan
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.example.daggerandroidmvvm.lobby;

import io.reactivex.Single;

class LobbyGreetingRepository {
    Single<String> getGreeting() {
        return Single.just("Hello from LobbyGreetingRepository");
    }
}
