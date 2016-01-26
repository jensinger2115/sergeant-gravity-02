package org.kramerlab.tofuml.api.impl.database.accessors.manager;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.tofuml.api.impl.logic.objects.Algorithm;

public class AlgorithmManagerAccessor

{
    /**
     * Operation getAlgorithm
     *
     * @param databaseId
     *            -
     * @return Algorithm
     */
    public Algorithm getAlgorithm(URI databaseId) {
        return null;
    }

    /**
     * Operation getAlgorithm
     *
     * @param algoname
     *            -
     * @return Algorithm
     */
    public Algorithm getAlgorithm(String algoname) {
        return null;
    }

    /**
     * Operation getAlgorithms
     *
     * @return Set<Algorithm>
     */
    public Set<Algorithm> getAlgorithms() {
        return new HashSet<Algorithm>();
    }
}
