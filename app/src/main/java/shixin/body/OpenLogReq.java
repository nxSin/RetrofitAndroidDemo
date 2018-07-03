package shixin.body;

/**
 * Created by shixin on 2017/10/24.
 * 开锁日志上传请求体
 */

public class OpenLogReq {

    /**
     * token : token
     * deviceOpenLog : {"doorId":"门id","deviceType":"设备类型","deviceSys":"设备系统","openType":"开锁方式","openInfo":"开锁信息","lockType":"门锁类型","openTime":"开锁时间","areaId":"区域ID","area":"区域","communityId":"小区ID","communityName":"小区名称","buildId":"楼栋ID","buildName":"楼栋名称","buildNum":"楼栋门牌","cellId":"单元ID","cellName":"单元名称","cellNum":"单元门牌","indexs":"下标","feedback":"开锁反馈","feedbackTime":"开锁反馈时间","imgId":"图片存储id"}
     */

    private String token;
    private DeviceOpenLogBean deviceOpenLog;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public DeviceOpenLogBean getDeviceOpenLog() {
        return deviceOpenLog;
    }

    public void setDeviceOpenLog(DeviceOpenLogBean deviceOpenLog) {
        this.deviceOpenLog = deviceOpenLog;
    }

    public static class DeviceOpenLogBean {
        /**
         * doorId : 门id
         * deviceType : 设备类型
         * deviceSys : 设备系统
         * openType : 开锁方式
         * openInfo : 开锁信息
         * lockType : 门锁类型
         * openTime : 开锁时间
         * areaId : 区域ID
         * area : 区域
         * communityId : 小区ID
         * communityName : 小区名称
         * buildId : 楼栋ID
         * buildName : 楼栋名称
         * buildNum : 楼栋门牌
         * cellId : 单元ID
         * cellName : 单元名称
         * cellNum : 单元门牌
         * indexs : 下标
         * feedback : 开锁反馈
         * feedbackTime : 开锁反馈时间
         * imgId : 图片存储id
         */

        private String doorId;
        private String deviceType;
        private String deviceSys;
        private String openType;
        private String openInfo;
        private String lockType;
        private String openTime;
        private String areaId;
        private String area;
        private String communityId;
        private String communityName;
        private String buildId;
        private String buildName;
        private String buildNum;
        private String cellId;
        private String cellName;
        private String cellNum;
        private String indexs;
        private String feedback;
        private String feedbackTime;
        private String imgId;

        public String getDoorId() {
            return doorId;
        }

        public void setDoorId(String doorId) {
            this.doorId = doorId;
        }

        public String getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(String deviceType) {
            this.deviceType = deviceType;
        }

        public String getDeviceSys() {
            return deviceSys;
        }

        public void setDeviceSys(String deviceSys) {
            this.deviceSys = deviceSys;
        }

        public String getOpenType() {
            return openType;
        }

        public void setOpenType(String openType) {
            this.openType = openType;
        }

        public String getOpenInfo() {
            return openInfo;
        }

        public void setOpenInfo(String openInfo) {
            this.openInfo = openInfo;
        }

        public String getLockType() {
            return lockType;
        }

        public void setLockType(String lockType) {
            this.lockType = lockType;
        }

        public String getOpenTime() {
            return openTime;
        }

        public void setOpenTime(String openTime) {
            this.openTime = openTime;
        }

        public String getAreaId() {
            return areaId;
        }

        public void setAreaId(String areaId) {
            this.areaId = areaId;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getCommunityId() {
            return communityId;
        }

        public void setCommunityId(String communityId) {
            this.communityId = communityId;
        }

        public String getCommunityName() {
            return communityName;
        }

        public void setCommunityName(String communityName) {
            this.communityName = communityName;
        }

        public String getBuildId() {
            return buildId;
        }

        public void setBuildId(String buildId) {
            this.buildId = buildId;
        }

        public String getBuildName() {
            return buildName;
        }

        public void setBuildName(String buildName) {
            this.buildName = buildName;
        }

        public String getBuildNum() {
            return buildNum;
        }

        public void setBuildNum(String buildNum) {
            this.buildNum = buildNum;
        }

        public String getCellId() {
            return cellId;
        }

        public void setCellId(String cellId) {
            this.cellId = cellId;
        }

        public String getCellName() {
            return cellName;
        }

        public void setCellName(String cellName) {
            this.cellName = cellName;
        }

        public String getCellNum() {
            return cellNum;
        }

        public void setCellNum(String cellNum) {
            this.cellNum = cellNum;
        }

        public String getIndexs() {
            return indexs;
        }

        public void setIndexs(String indexs) {
            this.indexs = indexs;
        }

        public String getFeedback() {
            return feedback;
        }

        public void setFeedback(String feedback) {
            this.feedback = feedback;
        }

        public String getFeedbackTime() {
            return feedbackTime;
        }

        public void setFeedbackTime(String feedbackTime) {
            this.feedbackTime = feedbackTime;
        }

        public String getImgId() {
            return imgId;
        }

        public void setImgId(String imgId) {
            this.imgId = imgId;
        }

        @Override
        public String toString() {
            return "DeviceOpenLogBean{" +
                    "doorId='" + doorId + '\'' +
                    ", deviceType='" + deviceType + '\'' +
                    ", deviceSys='" + deviceSys + '\'' +
                    ", openType='" + openType + '\'' +
                    ", openInfo='" + openInfo + '\'' +
                    ", lockType='" + lockType + '\'' +
                    ", openTime='" + openTime + '\'' +
                    ", areaId='" + areaId + '\'' +
                    ", area='" + area + '\'' +
                    ", communityId='" + communityId + '\'' +
                    ", communityName='" + communityName + '\'' +
                    ", buildId='" + buildId + '\'' +
                    ", buildName='" + buildName + '\'' +
                    ", buildNum='" + buildNum + '\'' +
                    ", cellId='" + cellId + '\'' +
                    ", cellName='" + cellName + '\'' +
                    ", cellNum='" + cellNum + '\'' +
                    ", indexs='" + indexs + '\'' +
                    ", feedback='" + feedback + '\'' +
                    ", feedbackTime='" + feedbackTime + '\'' +
                    ", imgId='" + imgId + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "OpenLogReq{" +
                "token='" + token + '\'' +
                ", deviceOpenLog=" + deviceOpenLog +
                '}';
    }
}
