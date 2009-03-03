package ch.mollusca.nabaztagimport groovy.util.GroovyTestCasepublic class NabaztagTest extends GroovyTestCase {
	void testSay(){		def hase = new Nabaztag("mac", "token")		hase.choreography(){		    ears(['right','left'], 8)		    		    def leds = ['left','middle','right']		    def colors = ['red', 'blue']		    def i = 10		    		   leds.each{l ->		       colors.each{ color ->		           led(l, color, i)		           i += 3		       }		   }		}		hase.send()	}
}
