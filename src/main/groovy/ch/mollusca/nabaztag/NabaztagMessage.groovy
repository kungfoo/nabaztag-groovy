package ch.mollusca.nabaztag

public class NabaztagMessage{
	def mac, token
	
	// will trigger something on the rabbit.
	def posright, posleft, idapp, tts, chor, chortitle, ears, nabcast, nabcasttitle, ttlive, voice, speed, pitch, action
	
	// api actions that yield some result
	def actions = [
	preview_tts 		: 1,
	friend_list 		: 2,
	list_messages 		: 3,
	get_timezone 		: 4,
	get_signature 		: 5, 
	get_blacklist 		: 6,
	get_sleep_state		: 7,
	get_version 		: 8,
	get_voices			: 9,
	get_name			:10,
	get_languages		:11,
	get_preview_media	:12,
	sleep				:13,
	wake				:14
	]
	
	NabaztagMessage(mac, token){
		this.mac = mac
		this.token = token
	}
	
	void send(){
		
	}
	
	void setAction(action){
		this.action = actions[action]
	}
}
