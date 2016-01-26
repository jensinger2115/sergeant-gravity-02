package org.kramerlab.tofuml.api.impl.mediation;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.util.Set;

import org.junit.Test;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.tofuml.api.impl.logic.objects.Algorithm;
import org.kramerlab.tofuml.api.impl.logic.objects.TOFUMLClassifier;

import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;

public class AlgorithmInterfaceTest {
	
	
	@Test
	void constructorTest() {
		URI validURI = URI.create("testUri");
		try {
			AlgorithmInterface aI = new AlgorithmInterface("validUserName",  validURI);
			assertNotNull("Constructor failed.", aI);
		} catch (SEITANException e) {
			assertTrue("Got SEITANException.", false);
		} 
	}
	
	@Test 
	void getAlgorithmWithInvalidURITest() {
		URI validURI = URI.create("testUri");
		AlgorithmInterface aI = null;
		try {
			aI = new AlgorithmInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", aI);
		URI invalidURI = URI.create("notExistingAlgorithmLocation");
		Algorithm testAlgorithm = aI.getAlgorithm(invalidURI);
		assertNull(testAlgorithm);
	}
	
	@Test
	void addAndGetAlgorithmTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		AlgorithmInterface aI = null;
		try {
			aI = new AlgorithmInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", aI);
		validURI = URI.create("testAlgorithmURI");
		Algorithm testAlgorithm = new TestAlgorithm(validURI, Permission.READ);
		InputStream in = new FileInputStream("Location of testAlgorithm");
		aI.addAlgorithm(in, "testAlgorithm", "Total awesome algorithm 3.0!!!!");
		Algorithm testAlgorithm1 = aI.getAlgorithm(validURI);
		assertNotNull(testAlgorithm1);
		assertEquals(testAlgorithm, (TestAlgorithm)testAlgorithm1);
		assertEquals("testAlgorithm", testAlgorithm1.getName());
		assertEquals("Total awesome algorithm 3.0!!!!", testAlgorithm1.getDescription());
	}
	
	@Test
	void addAndGetAlgorithmsTest() throws FileNotFoundException {
		URI validURI = URI.create("testUri");
		AlgorithmInterface aI = null;
		try {
			aI = new AlgorithmInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", aI);
		validURI = URI.create("testAlgorithmURI");
		Algorithm testAlgorithm = new TestAlgorithm(validURI, Permission.READ);
		InputStream in = new FileInputStream("Location of testAlgorithm");
		aI.addAlgorithm(in, "testAlgorithm", "Total awesome algorithm 3.0!!!!");
		Set<Algorithm> set = aI.getAlgorithms();
		assertNotNull(set);
		assertEquals(1, set.size());
		assertTrue(set.contains(testAlgorithm));
	}
	
	@Test
	void updateAlgorithmTest() throws FileNotFoundException, SEITANException {
		URI validURI = URI.create("testUri");
		AlgorithmInterface aI = null;
		try {
			aI = new AlgorithmInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", aI);
		validURI = URI.create("testAlgorithmURI");
		Algorithm testAlgorithm = new TestAlgorithm(validURI, Permission.READ);
		InputStream in = new FileInputStream("Location of testAlgorithm");
		aI.addAlgorithm(in, "testAlgorithm", "Total awesome algorithm 3.0!!!!");
		Algorithm testAlgorithm1 = aI.getAlgorithm(validURI);
		assertNotNull(testAlgorithm1);
		assertEquals(testAlgorithm, testAlgorithm1);
		assertEquals("testAlgorithm", testAlgorithm1.getName());
		assertEquals("Total awesome algorithm 3.0!!!!", testAlgorithm1.getDescription());
		aI.updateAlgorithm(validURI, "newName", "newDesc");
		testAlgorithm1 = aI.getAlgorithm(validURI);
		assertNotNull(testAlgorithm1);
		assertEquals(testAlgorithm, testAlgorithm1);
		assertEquals("newName", testAlgorithm1.getName());
		assertEquals("newDesc", testAlgorithm1.getDescription());
	}
	
	@Test
	void deleteAlgorithmTest() throws FileNotFoundException {
		URI validURI = URI.create("testUri");
		AlgorithmInterface aI = null;
		try {
			aI = new AlgorithmInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", aI);
		validURI = URI.create("testAlgorithm0URI");
		Algorithm testAlgorithm0 = new TestAlgorithm(validURI, Permission.READ);
		validURI = URI.create("testAlgorithm1URI");
		Algorithm testAlgorithm1 = new TestAlgorithm(validURI, Permission.READ);
		InputStream in0 = new FileInputStream("Location of testAlgorithm0");
		InputStream in1 = new FileInputStream("Location of testAlgorithm1");
		aI.addAlgorithm(in0, "testAlgorithm0", "Total awesome algorithm 3.0!!!!");
		aI.addAlgorithm(in1, "testAlgorithm1", "Total awesome algorithm 3.1beta!!!!");
		Set<Algorithm> set = aI.getAlgorithms();
		assertEquals(2, set.size());
		aI.deleteAlgorithm(validURI);
		set = aI.getAlgorithms();
		assertEquals(1, set.size());
		assertTrue(set.contains(testAlgorithm0));
		assertFalse(set.contains(testAlgorithm1));
	}
	
	@Test
	void deleteAlgorithmsTest() throws FileNotFoundException {
		URI validURI = URI.create("testUri");
		AlgorithmInterface aI = null;
		try {
			aI = new AlgorithmInterface("validUserName",  validURI);
			
		} catch (SEITANException e) {
			assertTrue("Got SEITANEXception.", false);
		}
		assertNotNull("Constructor failed.", aI);
		InputStream in0 = new FileInputStream("Location of testAlgorithm0");
		InputStream in1 = new FileInputStream("Location of testAlgorithm1");
		aI.addAlgorithm(in0, "testAlgorithm0", "Total awesome algorithm 3.0!!!!");
		aI.addAlgorithm(in1, "testAlgorithm1", "Total awesome algorithm 3.1beta!!!!");
		Set<Algorithm> set = aI.getAlgorithms();
		assertEquals(2, set.size());
		aI.deleteAlgorithms();
		set = aI.getAlgorithms();
		assertEquals(0, set.size());
	}
	
	class TestAlgorithm extends Algorithm {

		public TestAlgorithm(URI databaseId, Permission perm) {
			super(databaseId, perm);
			// TODO Auto-generated constructor stub
		}

		public void buildClassifier(Instances arg0) throws Exception {
			// TODO Auto-generated method stub
			
		}

		public double classifyInstance(Instance arg0) throws Exception {
			// TODO Auto-generated method stub
			return 0;
		}

		public double[] distributionForInstance(Instance arg0) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		public Capabilities getCapabilities() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TOFUMLClassifier getClassifier() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getOptions() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isInternal() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		protected SEITANObjectAccessor getAccessor(URI arg0, Permission arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getObjectType() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
