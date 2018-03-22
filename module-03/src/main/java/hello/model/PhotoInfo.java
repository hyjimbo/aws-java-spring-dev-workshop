package hello.model;


import javax.persistence.Entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "PhotoInfo")
public class PhotoInfo {
    private String id;
    private String prefix;
    private String photoInfo;
    private String transInfo;
    
    public PhotoInfo() {
    }
    
    public PhotoInfo(String prefix, String photoInfo, String transInfo) {
        this.prefix = prefix;
        this.photoInfo = photoInfo;
        this.transInfo = transInfo;
    }
 
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }
 
    @DynamoDBAttribute
    public String getPrefix() {
        return prefix;
    }
 
    @DynamoDBAttribute
    public String getPhotoInfo() {
        return photoInfo;
    }
    
    @DynamoDBAttribute
    public String getTransInfo() {
        return transInfo;
    }
    
		public void setId(String id) {
			this.id = id;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}
		
		public void setPhotoInfo(String photoInfo) {
			this.photoInfo = photoInfo;
		}

		public void setTransInfo(String transInfo) {
			this.transInfo = transInfo;
		}
		
	  @Override
	  public boolean equals(Object o) {
	      if (this == o) return true;
	      if (o == null || getClass() != o.getClass()) return false;

	      PhotoInfo p = (PhotoInfo) o;

	      return id.equals(p.id);
	  }

	  @Override
	  public int hashCode() {
	      return id.hashCode();
	  }
}
