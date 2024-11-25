def call(String ProjectName,String DockerHubUser, String ImageTag){
  sh "docker pull ${DockerHubUser}/${ProjectName}:${ImageTag}"
}
