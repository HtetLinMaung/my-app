# Use the official Tomcat image from the Docker Hub
FROM tomcat:9-jdk8

# Remove the default webapps from the Tomcat image
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file into the webapps directory of the Tomcat image
COPY target/my-app.war /usr/local/tomcat/webapps/ROOT.war
