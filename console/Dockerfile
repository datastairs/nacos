#
#  Copyright 2019-2021 China Mobile Communication Co., Ltd.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

FROM moxm/java:1.8-full as builder
WORKDIR /build
ARG JAR_FILE=target/nacos-server.jar
COPY ${JAR_FILE} app.jar
RUN java -Djarmode=layertools -jar app.jar extract && rm app.jar

FROM moxm/java:1.8-full
LABEL maintainer="liya@outlook.it"
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories && apk --no-cache add libstdc++
ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms512m -Xmx2048m -Djava.security.egd=file:/dev/./urandom"
WORKDIR nacos-server

COPY --from=builder /build/dependencies/ ./
COPY --from=builder /build/snapshot-dependencies/ ./
COPY --from=builder /build/spring-boot-loader/ ./
COPY --from=builder /build/application/ ./

EXPOSE 8848

CMD sleep 30; java $JAVA_OPTS org.springframework.boot.loader.JarLauncher
