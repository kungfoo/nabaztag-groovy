package ch.mollusca.nabaztag

public class Nabaztag{
	private NabaztagMessage message
	def voice
	
	public Nabaztag(mac, token){
		message = new NabaztagMessage(mac, token)
	}
	
	def void send(){
		def status = message.send()
	}
	
	def void say(text){
		message.tts = text
	}
	
	def choreography(closure){
		
	}
}
