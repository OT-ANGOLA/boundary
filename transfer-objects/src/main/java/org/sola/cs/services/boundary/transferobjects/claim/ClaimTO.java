package org.sola.cs.services.boundary.transferobjects.claim;

import java.util.Date;
import java.util.List;
import org.sola.services.common.contracts.AbstractReadWriteTO;

public class ClaimTO extends AbstractReadWriteTO {
    private String id;
    private String nr;
    private Date startDate;
    private String landUseCode;
    private String notes;
    private String northAdjacency;
    private String southAdjacency;
    private String eastAdjacency;
    private String westAdjacency;
    private String assigneeName;
    private List<ClaimLocationTO> locations;
    private List<ClaimCommentTO> comments;
    private Date lodgementDate;
    private Date challengeExpiryDate;
    private Date decisionDate;
    private String description;
    private String challengedClaimId;
    private ClaimPartyTO claimant;
    private List<ClaimShareTO> shares;
    private List<AttachmentTO> attachments;
    private String mappedGeometry;
    private String gpsGeometry;
    private String statusCode;
    private String typeCode;
    private String recorderName;
    private int version;
    private long claimArea;
    private FormPayloadTO dynamicForm;
    String serverUrl;
    private Date issuanceDate;
    
    private String blockNumber;
    private boolean hasConstructions;
    private Date constructionDate;
    private String northAdjacencyTypeCode;
    private String southAdjacencyTypeCode;
    private String eastAdjacencyTypeCode;
    private String westAdjacencyTypeCode;    
    private String neighborhood;
    private String landProjectCode;
    private String communeCode;
    
    public ClaimTO(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public Date getLodgementDate() {
        return lodgementDate;
    }

    public void setLodgementDate(Date lodgementDate) {
        this.lodgementDate = lodgementDate;
    }

    public Date getChallengeExpiryDate() {
        return challengeExpiryDate;
    }

    public void setChallengeExpiryDate(Date challengeExpiryDate) {
        this.challengeExpiryDate = challengeExpiryDate;
    }

    public Date getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(Date decisionDate) {
        this.decisionDate = decisionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChallengedClaimId() {
        return challengedClaimId;
    }

    public void setChallengedClaimId(String challengedClaimId) {
        this.challengedClaimId = challengedClaimId;
    }

    public ClaimPartyTO getClaimant() {
        return claimant;
    }

    public void setClaimant(ClaimPartyTO claimant) {
        this.claimant = claimant;
    }

    public List<ClaimShareTO> getShares() {
        return shares;
    }

    public void setShares(List<ClaimShareTO> shares) {
        this.shares = shares;
    }

    public List<AttachmentTO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentTO> attachments) {
        this.attachments = attachments;
    }

    public String getMappedGeometry() {
        return mappedGeometry;
    }

    public void setMappedGeometry(String mappedGeometry) {
        this.mappedGeometry = mappedGeometry;
    }

    public String getGpsGeometry() {
        return gpsGeometry;
    }

    public void setGpsGeometry(String gpsGeometry) {
        this.gpsGeometry = gpsGeometry;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLandUseCode() {
        return landUseCode;
    }

    public void setLandUseCode(String landUseCode) {
        this.landUseCode = landUseCode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNorthAdjacency() {
        return northAdjacency;
    }

    public void setNorthAdjacency(String northAdjacency) {
        this.northAdjacency = northAdjacency;
    }

    public String getSouthAdjacency() {
        return southAdjacency;
    }

    public void setSouthAdjacency(String southAdjacency) {
        this.southAdjacency = southAdjacency;
    }

    public String getEastAdjacency() {
        return eastAdjacency;
    }

    public void setEastAdjacency(String eastAdjacency) {
        this.eastAdjacency = eastAdjacency;
    }

    public String getWestAdjacency() {
        return westAdjacency;
    }

    public void setWestAdjacency(String westAdjacency) {
        this.westAdjacency = westAdjacency;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public List<ClaimLocationTO> getLocations() {
        return locations;
    }

    public void setLocations(List<ClaimLocationTO> locations) {
        this.locations = locations;
    }

    public List<ClaimCommentTO> getComments() {
        return comments;
    }

    public void setComments(List<ClaimCommentTO> comments) {
        this.comments = comments;
    }

    public String getRecorderName() {
        return recorderName;
    }

    public void setRecorderName(String recorderName) {
        this.recorderName = recorderName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getClaimArea() {
        return claimArea;
    }

    public void setClaimArea(long claimArea) {
        this.claimArea = claimArea;
    }

    public FormPayloadTO getDynamicForm() {
        return dynamicForm;
    }

    public void setDynamicForm(FormPayloadTO dynamicForm) {
        this.dynamicForm = dynamicForm;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }
    
    public Date getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Date issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public boolean isHasConstructions() {
        return hasConstructions;
    }

    public void setHasConstructions(boolean hasConstructions) {
        this.hasConstructions = hasConstructions;
    }

    public Date getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(Date constructionDate) {
        this.constructionDate = constructionDate;
    }

    public String getNorthAdjacencyTypeCode() {
        return northAdjacencyTypeCode;
    }

    public void setNorthAdjacencyTypeCode(String northAdjacencyTypeCode) {
        this.northAdjacencyTypeCode = northAdjacencyTypeCode;
    }

    public String getSouthAdjacencyTypeCode() {
        return southAdjacencyTypeCode;
    }

    public void setSouthAdjacencyTypeCode(String southAdjacencyTypeCode) {
        this.southAdjacencyTypeCode = southAdjacencyTypeCode;
    }

    public String getEastAdjacencyTypeCode() {
        return eastAdjacencyTypeCode;
    }

    public void setEastAdjacencyTypeCode(String eastAdjacencyTypeCode) {
        this.eastAdjacencyTypeCode = eastAdjacencyTypeCode;
    }

    public String getWestAdjacencyTypeCode() {
        return westAdjacencyTypeCode;
    }

    public void setWestAdjacencyTypeCode(String westAdjacencyTypeCode) {
        this.westAdjacencyTypeCode = westAdjacencyTypeCode;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getLandProjectCode() {
        return landProjectCode;
    }

    public void setLandProjectCode(String landProjectCode) {
        this.landProjectCode = landProjectCode;
    }

    public String getCommuneCode() {
        return communeCode;
    }

    public void setCommuneCode(String communeCode) {
        this.communeCode = communeCode;
    }
}
