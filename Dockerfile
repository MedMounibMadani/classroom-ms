FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
WORKDIR .
EXPOSE 8050
COPY target/*-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "sleep 120 && java -jar /app.jar"]
