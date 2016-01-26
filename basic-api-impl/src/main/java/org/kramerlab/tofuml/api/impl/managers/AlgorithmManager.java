package org.kramerlab.tofuml.api.impl.managers;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.manager.SEITANManager;
import org.kramerlab.seitan.api.impl.objects.User;
import org.kramerlab.tofuml.api.impl.database.accessors.manager.AlgorithmManagerAccessor;
import org.kramerlab.tofuml.api.impl.logic.objects.Algorithm;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;

public class AlgorithmManager extends SEITANManager {
    /** Associations */
    private AlgorithmManagerAccessor accessor;

    /**
     * Operation AlgorithmManager
     *
     * @param caller
     *            -
     * @return
     */
    public AlgorithmManager(User caller) {
        super(caller);
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
     * @param name
     *            -
     * @return Algorithm
     */
    public Algorithm getAlgorithm(String name) {
        return null;
    }

    /**
     * Operation getSuitableAlgorithms
     *
     * @param dataset
     *            -
     * @return Set<Algorithm>
     */
    public Set<Algorithm> getSuitableAlgorithms(Dataset dataset) {
        return new HashSet<Algorithm>();
    }

}
