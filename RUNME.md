# Setup
## Install dependencies on your computer
Before beginning you'll need some dependencies as mentioned in 
[README.md](./README.md)

* [Download git](
    https://git-scm.com/downloads)
* [Install git](
    https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Download Java 12](
    https://jdk.java.net/12/)
* [Install Java 12](
    https://openjdk.java.net/install/)
    
# Set up the project
* clone the repository using git 
    ~~~~
    git clone https://github.com/chrisaaronmoser/scratch.git
    ~~~~
    Using git we are downloading the source code of our application
    locally.  The source will drive most of the build, test, etc. but
    we've got to start somewhere.  You should run this command from the
    folder you wish to store your project in.  i.e. If you have a 
    designated "projects" or "workspaces" folder you like to use then 
    run this command from that folder in you command line tool of 
    choice. 
* cd into the newly created project
    ~~~~
    cd scratch
    ~~~~
* run Maven wrapper
    ~~~~
    .mvnw/mvn clean package
    ~~~~
    A Maven wrapper is a way to work with Maven if you don't want to 
    install it on your computer, or you need a specific version of 
    Maven for a specific project.  It isolates the user of the source
    from another variable and is a good thing.  If you have Maven
    already installed on your computer locally, you can use the standard
    `mvn clean package` if you like.  I anticipate you'll do just that
    as soon as you can, but if not, this is ok too.
    
## Notes
  * Maven will install a local copy of node locally in the project's
      base directory    
  * npm is included with the local copy of node and that installs
      all project dependencies that npm is aware of in the 
      `${project.basedir}/src/main/ui/node_modules` directory
      
# Run the application
~~~~
cd target 
~~~~
~~~~
java -jar scratch-0.0.1-SNAPSHOT.jar
~~~~
