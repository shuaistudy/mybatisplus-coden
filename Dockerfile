FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER wangiegie@gmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /gekft-codegen

WORKDIR /gekft-codegen

EXPOSE 5003

ADD ./gekft-visual/gekft-codegen/target/gekft-codegen.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar gekft-codegen.jar
