package ch.mollusca.nabaztag



public class NabaztagMain{

	public static void main(args){
		def hase = new Nabaztag("mac", "token")

		hase.choreography(){
		    ears(['right','left'], 8)
		    
		    def leds = ['left','middle','right']
		    def colors = ['red', 'blue']
		    def i = 10
		    
		   leds.each{l ->
		       colors.each{ color ->
		           led(l, color, i)
		           i += 3
		       }
		   }
		}
		hase.send()
	}
}
