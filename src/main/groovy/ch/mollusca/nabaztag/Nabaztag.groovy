package ch.mollusca.nabaztag

public class Nabaztag{
	def mac
	def token
	private NabaztagMessage message
	def voice
	
	public Nabaztag(mac, token){
		this.mac = mac
		this.token = token
	}
	
	def void send(){
		
	}
	
	def void say(text){
		message.tts = text
	}
	
	def chor(closure){
		
	}
}
