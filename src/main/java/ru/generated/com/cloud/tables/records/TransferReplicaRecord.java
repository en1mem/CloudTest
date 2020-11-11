/*
 * This file is generated by jOOQ.
*/
package ru.generated.com.cloud.tables.records;


import ru.generated.com.cloud.tables.TransferReplica;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TransferReplicaRecord extends UpdatableRecordImpl<TransferReplicaRecord> implements Record5<Long, Long, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 289996825;

    /**
     * Setter for <code>com.transfer_replica.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>com.transfer_replica.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>com.transfer_replica.element_id</code>.
     */
    public void setElementId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>com.transfer_replica.element_id</code>.
     */
    public Long getElementId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>com.transfer_replica.transfer_status</code>.
     */
    public void setTransferStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>com.transfer_replica.transfer_status</code>.
     */
    public String getTransferStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>com.transfer_replica.start_date_time</code>.
     */
    public void setStartDateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>com.transfer_replica.start_date_time</code>.
     */
    public Timestamp getStartDateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>com.transfer_replica.end_date_time</code>.
     */
    public void setEndDateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>com.transfer_replica.end_date_time</code>.
     */
    public Timestamp getEndDateTime() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TransferReplica.TRANSFER_REPLICA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TransferReplica.TRANSFER_REPLICA.ELEMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TransferReplica.TRANSFER_REPLICA.TRANSFER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TransferReplica.TRANSFER_REPLICA.START_DATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TransferReplica.TRANSFER_REPLICA.END_DATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getElementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTransferStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getStartDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getEndDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getElementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTransferStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getStartDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getEndDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransferReplicaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransferReplicaRecord value2(Long value) {
        setElementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransferReplicaRecord value3(String value) {
        setTransferStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransferReplicaRecord value4(Timestamp value) {
        setStartDateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransferReplicaRecord value5(Timestamp value) {
        setEndDateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransferReplicaRecord values(Long value1, Long value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransferReplicaRecord
     */
    public TransferReplicaRecord() {
        super(TransferReplica.TRANSFER_REPLICA);
    }

    /**
     * Create a detached, initialised TransferReplicaRecord
     */
    public TransferReplicaRecord(Long id, Long elementId, String transferStatus, Timestamp startDateTime, Timestamp endDateTime) {
        super(TransferReplica.TRANSFER_REPLICA);

        set(0, id);
        set(1, elementId);
        set(2, transferStatus);
        set(3, startDateTime);
        set(4, endDateTime);
    }
}