FROM openjdk:latest
WORKDIR /usr/src/app
COPY ./src/main/java .
RUN javac -sourcepath . -d out ./com/iksgroup/mainpack/Program.java
WORKDIR /usr/src/app/out
CMD java -classpath . com.iksgroup.mainpack.Program