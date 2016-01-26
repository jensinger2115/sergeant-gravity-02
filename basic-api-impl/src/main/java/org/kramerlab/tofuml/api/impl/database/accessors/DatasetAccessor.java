package org.kramerlab.tofuml.api.impl.database.accessors;

import java.net.URI;

import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.ReviewableSEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;

import weka.core.Instances;

public class DatasetAccessor extends ReviewableSEITANObjectAccessor {
    /**
     * Operation DatasetAccessor
     *
     * @param databaseId
     *            -
     * @param perm
     *            -
     * @return
     */
    public DatasetAccessor(URI databaseId, Permission perm) {
        super(databaseId, perm);
    }

    /**
     * Operation getInstances
     *
     * @return Instances
     */
    public Instances getInstances() {
        return null;
    }

    /**
     * Operation concreteSave
     *
     * @param obj
     *            -
     * @return SEITANObject
     */
    public SEITANObject concreteSave(SEITANObject obj) {
        return null;
    }

    /**
     * Operation concreteUpdate
     *
     * @param obj
     *            -
     */
    public void concreteUpdate(SEITANObject obj) {
    }

    /**
     * Operation concreteDelete
     *
     * @param obj
     *            -
     */
    public void concreteDelete(SEITANObject obj) {
    }

}
