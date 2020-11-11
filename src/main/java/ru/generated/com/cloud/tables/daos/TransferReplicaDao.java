/*
 * This file is generated by jOOQ.
*/
package ru.generated.com.cloud.tables.daos;


import ru.generated.com.cloud.tables.records.TransferReplicaRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TransferReplicaDao extends DAOImpl<TransferReplicaRecord, ru.generated.com.cloud.tables.pojos.TransferReplica, Long> {

    /**
     * Create a new TransferReplicaDao without any configuration
     */
    public TransferReplicaDao() {
        super(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA, ru.generated.com.cloud.tables.pojos.TransferReplica.class);
    }

    /**
     * Create a new TransferReplicaDao with an attached configuration
     */
    @Autowired
    public TransferReplicaDao(Configuration configuration) {
        super(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA, ru.generated.com.cloud.tables.pojos.TransferReplica.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(ru.generated.com.cloud.tables.pojos.TransferReplica object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<ru.generated.com.cloud.tables.pojos.TransferReplica> fetchById(Long... values) {
        return fetch(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public ru.generated.com.cloud.tables.pojos.TransferReplica fetchOneById(Long value) {
        return fetchOne(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA.ID, value);
    }

    /**
     * Fetch records that have <code>element_id IN (values)</code>
     */
    public List<ru.generated.com.cloud.tables.pojos.TransferReplica> fetchByElementId(Long... values) {
        return fetch(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA.ELEMENT_ID, values);
    }

    /**
     * Fetch records that have <code>transfer_status IN (values)</code>
     */
    public List<ru.generated.com.cloud.tables.pojos.TransferReplica> fetchByTransferStatus(String... values) {
        return fetch(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA.TRANSFER_STATUS, values);
    }

    /**
     * Fetch records that have <code>start_date_time IN (values)</code>
     */
    public List<ru.generated.com.cloud.tables.pojos.TransferReplica> fetchByStartDateTime(Timestamp... values) {
        return fetch(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA.START_DATE_TIME, values);
    }

    /**
     * Fetch records that have <code>end_date_time IN (values)</code>
     */
    public List<ru.generated.com.cloud.tables.pojos.TransferReplica> fetchByEndDateTime(Timestamp... values) {
        return fetch(ru.generated.com.cloud.tables.TransferReplica.TRANSFER_REPLICA.END_DATE_TIME, values);
    }
}
