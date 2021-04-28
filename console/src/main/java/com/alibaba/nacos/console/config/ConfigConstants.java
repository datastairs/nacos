/*
 * Copyright 2019-2021 China Mobile Communication Co., Ltd.
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
 * limitations under the License.
 */

package com.alibaba.nacos.console.config;

/**
 * 覆盖Nacos默认配置.
 *
 * @author nacos
 */
public interface ConfigConstants {

    /**
     * The System property name of Standalone mode.
     */
    String STANDALONE_MODE = "nacos.standalone";

    /**
     * 是否开启认证.
     */
    String AUTH_ENABLED = "nacos.core.auth.enabled";

    /**
     * 日志目录.
     */
    String LOG_BASEDIR = "server.tomcat.basedir";

}
