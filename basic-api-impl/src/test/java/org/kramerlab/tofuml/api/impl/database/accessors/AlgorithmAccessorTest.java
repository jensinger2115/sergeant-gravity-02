package org.kramerlab.tofuml.api.impl.database.accessors;

import static org.junit.Assert.*;

import java.net.URI;

import org.junit.Test;
import org.kramerlab.seitan.api.impl.JIM;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.tofuml.api.impl.logic.objects.ExternalAlgorithm;

public class AlgorithmAccessorTest {

	@Test
	void constructorTest() {
		URI validURI = URI.create("validURI");
		AlgorithmAccessor aa  = new AlgorithmAccessor(validURI, Permission.READWRITE);
		assertNotNull(aa);
	}
	
	@Test
	void concreteSaveTest() {
		URI validURI = URI.create("validURI");
		AlgorithmAccessor aa  = new AlgorithmAccessor(validURI, Permission.READWRITE);
		assertNotNull(aa);
		ExternalAlgorithm eA = new ExternalAlgorithm(null, Permission.READ);
		eA = (ExternalAlgorithm) aa.concreteSave(JIM.getPackage());
		assertNotNull(eA.getUri());
	}
	
}
