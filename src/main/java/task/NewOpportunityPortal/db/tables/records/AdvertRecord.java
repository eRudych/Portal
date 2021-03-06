/*
 * This file is generated by jOOQ.
 */
package task.NewOpportunityPortal.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import task.NewOpportunityPortal.db.tables.Advert;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdvertRecord extends UpdatableRecordImpl<AdvertRecord> implements Record12<Long, Long, Long, Long[], String, String, String, Long, Long[], Long[], Long, Timestamp> {

    private static final long serialVersionUID = -657445669;

    /**
     * Setter for <code>public.advert.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.advert.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.advert.creatorId</code>.
     */
    public void setCreatorid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.advert.creatorId</code>.
     */
    public Long getCreatorid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.advert.categoryId</code>.
     */
    public void setCategoryid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.advert.categoryId</code>.
     */
    public Long getCategoryid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.advert.workersId</code>.
     */
    public void setWorkersid(Long... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.advert.workersId</code>.
     */
    public Long[] getWorkersid() {
        return (Long[]) get(3);
    }

    /**
     * Setter for <code>public.advert.subject</code>.
     */
    public void setSubject(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.advert.subject</code>.
     */
    public String getSubject() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.advert.info</code>.
     */
    public void setInfo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.advert.info</code>.
     */
    public String getInfo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.advert.linkToDoc</code>.
     */
    public void setLinktodoc(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.advert.linkToDoc</code>.
     */
    public String getLinktodoc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.advert.statusId</code>.
     */
    public void setStatusid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.advert.statusId</code>.
     */
    public Long getStatusid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.advert.tagsId</code>.
     */
    public void setTagsid(Long... value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.advert.tagsId</code>.
     */
    public Long[] getTagsid() {
        return (Long[]) get(8);
    }

    /**
     * Setter for <code>public.advert.amountOfMarks</code>.
     */
    public void setAmountofmarks(Long... value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.advert.amountOfMarks</code>.
     */
    public Long[] getAmountofmarks() {
        return (Long[]) get(9);
    }

    /**
     * Setter for <code>public.advert.averageMark</code>.
     */
    public void setAveragemark(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.advert.averageMark</code>.
     */
    public Long getAveragemark() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>public.advert.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.advert.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, Long[], String, String, String, Long, Long[], Long[], Long, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, Long, Long[], String, String, String, Long, Long[], Long[], Long, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Advert.ADVERT.ID;
    }

    @Override
    public Field<Long> field2() {
        return Advert.ADVERT.CREATORID;
    }

    @Override
    public Field<Long> field3() {
        return Advert.ADVERT.CATEGORYID;
    }

    @Override
    public Field<Long[]> field4() {
        return Advert.ADVERT.WORKERSID;
    }

    @Override
    public Field<String> field5() {
        return Advert.ADVERT.SUBJECT;
    }

    @Override
    public Field<String> field6() {
        return Advert.ADVERT.INFO;
    }

    @Override
    public Field<String> field7() {
        return Advert.ADVERT.LINKTODOC;
    }

    @Override
    public Field<Long> field8() {
        return Advert.ADVERT.STATUSID;
    }

    @Override
    public Field<Long[]> field9() {
        return Advert.ADVERT.TAGSID;
    }

    @Override
    public Field<Long[]> field10() {
        return Advert.ADVERT.AMOUNTOFMARKS;
    }

    @Override
    public Field<Long> field11() {
        return Advert.ADVERT.AVERAGEMARK;
    }

    @Override
    public Field<Timestamp> field12() {
        return Advert.ADVERT.CREATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCreatorid();
    }

    @Override
    public Long component3() {
        return getCategoryid();
    }

    @Override
    public Long[] component4() {
        return getWorkersid();
    }

    @Override
    public String component5() {
        return getSubject();
    }

    @Override
    public String component6() {
        return getInfo();
    }

    @Override
    public String component7() {
        return getLinktodoc();
    }

    @Override
    public Long component8() {
        return getStatusid();
    }

    @Override
    public Long[] component9() {
        return getTagsid();
    }

    @Override
    public Long[] component10() {
        return getAmountofmarks();
    }

    @Override
    public Long component11() {
        return getAveragemark();
    }

    @Override
    public Timestamp component12() {
        return getCreatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCreatorid();
    }

    @Override
    public Long value3() {
        return getCategoryid();
    }

    @Override
    public Long[] value4() {
        return getWorkersid();
    }

    @Override
    public String value5() {
        return getSubject();
    }

    @Override
    public String value6() {
        return getInfo();
    }

    @Override
    public String value7() {
        return getLinktodoc();
    }

    @Override
    public Long value8() {
        return getStatusid();
    }

    @Override
    public Long[] value9() {
        return getTagsid();
    }

    @Override
    public Long[] value10() {
        return getAmountofmarks();
    }

    @Override
    public Long value11() {
        return getAveragemark();
    }

    @Override
    public Timestamp value12() {
        return getCreatedAt();
    }

    @Override
    public AdvertRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdvertRecord value2(Long value) {
        setCreatorid(value);
        return this;
    }

    @Override
    public AdvertRecord value3(Long value) {
        setCategoryid(value);
        return this;
    }

    @Override
    public AdvertRecord value4(Long... value) {
        setWorkersid(value);
        return this;
    }

    @Override
    public AdvertRecord value5(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public AdvertRecord value6(String value) {
        setInfo(value);
        return this;
    }

    @Override
    public AdvertRecord value7(String value) {
        setLinktodoc(value);
        return this;
    }

    @Override
    public AdvertRecord value8(Long value) {
        setStatusid(value);
        return this;
    }

    @Override
    public AdvertRecord value9(Long... value) {
        setTagsid(value);
        return this;
    }

    @Override
    public AdvertRecord value10(Long... value) {
        setAmountofmarks(value);
        return this;
    }

    @Override
    public AdvertRecord value11(Long value) {
        setAveragemark(value);
        return this;
    }

    @Override
    public AdvertRecord value12(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public AdvertRecord values(Long value1, Long value2, Long value3, Long[] value4, String value5, String value6, String value7, Long value8, Long[] value9, Long[] value10, Long value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdvertRecord
     */
    public AdvertRecord() {
        super(Advert.ADVERT);
    }

    /**
     * Create a detached, initialised AdvertRecord
     */
    public AdvertRecord(Long id, Long creatorid, Long categoryid, Long[] workersid, String subject, String info, String linktodoc, Long statusid, Long[] tagsid, Long[] amountofmarks, Long averagemark, Timestamp createdAt) {
        super(Advert.ADVERT);

        set(0, id);
        set(1, creatorid);
        set(2, categoryid);
        set(3, workersid);
        set(4, subject);
        set(5, info);
        set(6, linktodoc);
        set(7, statusid);
        set(8, tagsid);
        set(9, amountofmarks);
        set(10, averagemark);
        set(11, createdAt);
    }
}
