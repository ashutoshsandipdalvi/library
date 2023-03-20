def desc_func(new_var)
{
  git "https://github.com/ashutoshsandipdalvi/${new_var}"
}
def package_func()
{
  sh "mvn package"
}
def deploy_func(job,ip,sample_path)
{
  sh "scp /var/lib/jenkins/workspace/${job}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${sample_path}"
}
def download_func(file_name)
{
  sh "java -jar /var/lib/jenkins/workspace/${file_name}/testing.jar"
}
