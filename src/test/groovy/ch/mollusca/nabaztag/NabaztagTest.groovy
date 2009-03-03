package ch.mollusca.nabaztagimport groovy.util.GroovyTestCasepublic class NabaztagTest extends GroovyTestCase {
	def hase		void testSay(){		hase.choreography(){			speed(20)						ears(['right'], 8)						def leds = ['left','middle','right']			def colors = ['red', 'blue']			def i = 10						leds.each{l -> colors.each{ color -> led(l, color, i); i += 3 } }		}		hase.send()	}	
	void setUp() {
		hase = new Nabaztag("mac", "token")
	}		void testLedColors(){		def colors = hase.getLedColors()		assertNotNull(colors)		colors.each{c -> println c }	}
}
