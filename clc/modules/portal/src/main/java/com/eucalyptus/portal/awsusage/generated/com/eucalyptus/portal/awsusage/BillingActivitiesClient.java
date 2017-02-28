/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.portal.awsusage;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

/**
 * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities}. 
 * Used to invoke activities asynchronously from workflow code.
 */
public interface BillingActivitiesClient extends ActivitiesClient
{

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#createAccountQueues}
     */
    Promise<java.util.Map<java.lang.String,java.lang.String>> createAccountQueues(String globalQueue);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#createAccountQueues}
     */
    Promise<java.util.Map<java.lang.String,java.lang.String>> createAccountQueues(String globalQueue, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#createAccountQueues}
     */
    Promise<java.util.Map<java.lang.String,java.lang.String>> createAccountQueues(String globalQueue, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#createAccountQueues}
     */
    Promise<java.util.Map<java.lang.String,java.lang.String>> createAccountQueues(Promise<String> globalQueue);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#createAccountQueues}
     */
    Promise<java.util.Map<java.lang.String,java.lang.String>> createAccountQueues(Promise<String> globalQueue, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#createAccountQueues}
     */
    Promise<java.util.Map<java.lang.String,java.lang.String>> createAccountQueues(Promise<String> globalQueue, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#getAwsReportUsageRecord}
     */
    Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> getAwsReportUsageRecord(String accountId, String queueName);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#getAwsReportUsageRecord}
     */
    Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> getAwsReportUsageRecord(String accountId, String queueName, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#getAwsReportUsageRecord}
     */
    Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> getAwsReportUsageRecord(String accountId, String queueName, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#getAwsReportUsageRecord}
     */
    Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> getAwsReportUsageRecord(Promise<String> accountId, Promise<String> queueName);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#getAwsReportUsageRecord}
     */
    Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> getAwsReportUsageRecord(Promise<String> accountId, Promise<String> queueName, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#getAwsReportUsageRecord}
     */
    Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> getAwsReportUsageRecord(Promise<String> accountId, Promise<String> queueName, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#writeAwsReportHourlyUsage}
     */
    Promise<Void> writeAwsReportHourlyUsage(String accountId, java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord> records);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#writeAwsReportHourlyUsage}
     */
    Promise<Void> writeAwsReportHourlyUsage(String accountId, java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord> records, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#writeAwsReportHourlyUsage}
     */
    Promise<Void> writeAwsReportHourlyUsage(String accountId, java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord> records, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#writeAwsReportHourlyUsage}
     */
    Promise<Void> writeAwsReportHourlyUsage(Promise<String> accountId, Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> records);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#writeAwsReportHourlyUsage}
     */
    Promise<Void> writeAwsReportHourlyUsage(Promise<String> accountId, Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> records, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#writeAwsReportHourlyUsage}
     */
    Promise<Void> writeAwsReportHourlyUsage(Promise<String> accountId, Promise<java.util.List<com.eucalyptus.portal.awsusage.AwsUsageRecord>> records, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#deleteAccountQueues}
     */
    Promise<Void> deleteAccountQueues(java.util.List<java.lang.String> queues);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#deleteAccountQueues}
     */
    Promise<Void> deleteAccountQueues(java.util.List<java.lang.String> queues, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#deleteAccountQueues}
     */
    Promise<Void> deleteAccountQueues(java.util.List<java.lang.String> queues, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#deleteAccountQueues}
     */
    Promise<Void> deleteAccountQueues(Promise<java.util.List<java.lang.String>> queues);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#deleteAccountQueues}
     */
    Promise<Void> deleteAccountQueues(Promise<java.util.List<java.lang.String>> queues, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#deleteAccountQueues}
     */
    Promise<Void> deleteAccountQueues(Promise<java.util.List<java.lang.String>> queues, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireVolumeUsage}
     */
    Promise<Void> fireVolumeUsage();

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireVolumeUsage}
     */
    Promise<Void> fireVolumeUsage(Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireVolumeUsage}
     */
    Promise<Void> fireVolumeUsage(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireSnapshotUsage}
     */
    Promise<Void> fireSnapshotUsage();

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireSnapshotUsage}
     */
    Promise<Void> fireSnapshotUsage(Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireSnapshotUsage}
     */
    Promise<Void> fireSnapshotUsage(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireAddressUsage}
     */
    Promise<Void> fireAddressUsage();

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireAddressUsage}
     */
    Promise<Void> fireAddressUsage(Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireAddressUsage}
     */
    Promise<Void> fireAddressUsage(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireS3ObjectUsage}
     */
    Promise<Void> fireS3ObjectUsage();

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireS3ObjectUsage}
     */
    Promise<Void> fireS3ObjectUsage(Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireS3ObjectUsage}
     */
    Promise<Void> fireS3ObjectUsage(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireLoadBalancerUsage}
     */
    Promise<Void> fireLoadBalancerUsage();

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireLoadBalancerUsage}
     */
    Promise<Void> fireLoadBalancerUsage(Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.portal.awsusage.BillingActivities#fireLoadBalancerUsage}
     */
    Promise<Void> fireLoadBalancerUsage(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);

}