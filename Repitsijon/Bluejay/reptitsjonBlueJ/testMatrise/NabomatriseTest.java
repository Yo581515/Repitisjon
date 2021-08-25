package testMatrise;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import torsdag.Graf;
import torsdag.Nabomatrise;

/**
 * The test class NabomatriseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NabomatriseTest
{
    private String[] nodenavn = { "A", "B", "C", "D", "E" };
	private Graf g;

	@Before
	public void oppretteNyGrafUtenKanter() {
		g = new Nabomatrise(nodenavn);
	}

	@Test
	public void nyGrafSkalHaNNoder() {
		assertEquals(nodenavn.length, g.getAntallNoder());
	}

	@Test
	public void nyGrafSkalHaNullKanter() {
		assertEquals(0, g.getAntallKanter());
	}

	@Test
	public void nyGrafSkalInneholdeNodeneGittVedStart() {
		List<String> noderIGraf = g.alleNoder();
		List<String> noderGittVedStart = Arrays.asList(nodenavn);
		assertTrue(noderIGraf.containsAll(noderGittVedStart));
	}

	@Test
	public void iNyGrafSkalIngenVareNaboer1() {
		List<String> noderIGraf = g.alleNoder();
		for (String u : noderIGraf) {
			for (String v : noderIGraf) {
				assertFalse(g.erNaboer(u, v));
			}
		}
	}

	@Test
	public void iNyGrafSkalIngenVareNaboer2() {
		List<String> noderIGraf = g.alleNoder();
		for (String u : noderIGraf) {
			assertTrue(g.getNaboer(u).isEmpty());
		}
	}
}
