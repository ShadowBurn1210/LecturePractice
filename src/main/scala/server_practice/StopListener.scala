package server_practice

import com.corundumstudio.socketio.listener.{ConnectListener, DataListener, DisconnectListener}
import com.corundumstudio.socketio.{AckRequest, Configuration, SocketIOClient, SocketIOServer}

class StopListener(server: Server) extends DataListener[Nothing]{
  override def onData(client: SocketIOClient, data: Nothing, ackSender: AckRequest): Unit = {
    println("stopping server")
    server.server.stop()
  }
}
