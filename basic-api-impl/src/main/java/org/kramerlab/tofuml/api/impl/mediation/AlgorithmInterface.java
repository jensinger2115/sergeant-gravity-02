package org.kramerlab.tofuml.api.impl.mediation;

import java.io.InputStream;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.mediation.SEITANInterface;
import org.kramerlab.tofuml.api.impl.logic.objects.Algorithm;
import org.kramerlab.tofuml.api.impl.managers.AlgorithmManager;

public class AlgorithmInterface extends SEITANInterface

{
    public AlgorithmInterface(String username, URI request)
            throws SEITANException {
        super(username, request);
    }

    /** Associations */
    private AlgorithmManager manager;

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
     * Operation getAlgorithms
     *
     * @return Set<Algorithm>
     */
    public Set<Algorithm> getAlgorithms() {
        return new HashSet<Algorithm>();
    }

    /**
     * Operation deleteAlgorithm
     *
     * @param databaseId
     *            -
     */
    public void deleteAlgorithm(URI databaseId) {
    }

    /**
     * Operation deleteAlgorithms
     *
     */
    public void deleteAlgorithms() {
    }

    /**
     * Operation updateAlgorithm
     *
     * @param databaseId
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateAlgorithm(URI databaseId, String newName, String newDesc) {
    }

    /**
     * Operation addAlgorithm
     *
     * @param algo
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     * @return Algorithm
     */
    public Algorithm addAlgorithm(InputStream algo, String name, String desc) {
        return null;
    }
}
