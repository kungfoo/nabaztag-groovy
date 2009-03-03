package ch.mollusca.nabaztag

import java.lang.RuntimeExceptionimport org.codehaus.groovy.runtime.metaclass.NewMetaMethodpublic class Nabaztag{
	private NabaztagMessage message
	def voice
	
	public Nabaztag(mac, token){
		newMessage(mac, token)
	}
	
	def send(){
		message.voice = voice
		def response = message.send()
		newMessage(message.mac, message.token)
		
		if(response && response.success){
			return response
		}
		else{
			throw new RuntimeException("Response was not successful!!")
		}
	}
	
	def void say(text){
		message.tts = text
	}
	
	def void moveEars(left, right){
		message.posleft = left
		message.posright = right
	}
	
	def choreography(closure){
		closure.delegate = new NabaztagChoreography()
		closure()
		return null
	}
	
	def getLedColors(){
		return NabaztagChoreography.LED_COLORS.keySet()
	}
	
	def newMessage(mac, token){
		message = new NabaztagMessage(mac, token)
	}
}
