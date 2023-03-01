package server_practice


import com.corundumstudio.socketio.listener.{ConnectListener, DataListener, DisconnectListener}
import com.corundumstudio.socketio.{AckRequest, Configuration, SocketIOClient, SocketIOServer}
class Server {


  val config: Configuration = new Configuration {
    setHostname("localhost")
    setPort(8080)
  }


  val server: SocketIOServer = new SocketIOServer(config)
  server.addConnectListener(new ConnectionListener())
  server.addDisconnectListener(new DisconnectionListener())
  server.addEventListener("chat_message", classOf[String], new MessageListener())
  server.addEventListener("stop_server", classOf[Nothing], new StopListener(this))
  server.start()

}
object Server {
  def main(args: Array[String]): Unit = {
    new Server
  }

}
