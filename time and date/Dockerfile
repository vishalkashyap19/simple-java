# pull a base image which gives all required tools and libraries
FROM openjdk:17-jdk-alpine

#create a folder where the app code will be run
WORKDIR /app

#copy source code from HOST machine to my container
COPY /src/TodayDate.java /app/

#compile the application code
RUN javac TodayDate.java

#run the application
CMD [ "java", "TodayDate" ]
#cmd can be overwrite


#ENTRYPOINT[""] can not be overwritten
