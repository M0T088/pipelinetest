import moto.HelloConnections.*

def moto() {
    HelloService service = new HelloService()
    String show = service.checkHello()
    echo show
   }
/*def var() {
    sh '''
     mvn -v
     java --version
     docker --version
     docker-compose --version
     ansible --version
     sshpass -V
    '''
}*/

