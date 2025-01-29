public class SmartPhone {
	private String Brand;
	private String model;
	private int storageCapacity;
	int MAX_STORAGE_CAPACITY = 512;
	
	public String getBrand() {
		return Brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getStorageCapacity() {
		return storageCapacity;
	}
	
	public void setBrand(String Brand) {
		if(Brand != null && Brand.length() >= 2) {
			this.Brand = Brand;
		}else
			System.out.println("Error: Brand must have at least  2 Characters!");
	}
	
	public void setModel(String model) {
		if(model != null && model.length() >= 2) {
			this.model = model;
		}else
			System.out.println("Error: Model must have at least  2 Characters!");
	}
	
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity >=1 && storageCapacity <= 512) {
			this.storageCapacity = storageCapacity;
		}else
			System.out.print("Error: Storage capacity must between 1 and 512GB!");
	}
	
	public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            if (this.storageCapacity + additionalStorage <= MAX_STORAGE_CAPACITY) {
                this.storageCapacity += additionalStorage;
            } else {
                System.out.println("Error: Storage capacity cannot exceed " + MAX_STORAGE_CAPACITY + " GB!");
            }
        } else {
            System.out.println("Error: Additional storage must be positive!");
        }
    }
	
	public int getRemainingStorage(int usedStorage) {
        if (usedStorage >= 0 && usedStorage <= this.storageCapacity) {
            return this.storageCapacity - usedStorage;
        } else {
            System.out.println("Error: Used storage must be between 0 and " + this.storageCapacity + " GB!");
            return -1;
        }
    }
	
	public void printDetails() {
		System.out.println("Smartphone Detail: \nBrand: "+Brand+"\nModel: "+model+"\nStorage: "+storageCapacity);
	}
}
