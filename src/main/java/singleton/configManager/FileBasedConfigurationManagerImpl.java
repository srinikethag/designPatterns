package singleton.configManager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        String value = properties.getProperty(key);
        if(value == null) return null;

        return convert(value, type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        properties.setProperty(key, value);
        // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        if(value!=null){
            properties.setProperty(key, value.toString());
        } else {
            throw new IllegalArgumentException("Value cannot be null");
        }
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        properties.remove(key);
        //throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();
        //throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(instance == null){
            instance = new FileBasedConfigurationManagerImpl();
        }

        return instance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        instance = null;
    }

    private static FileBasedConfigurationManagerImpl instance;

    private FileBasedConfigurationManagerImpl(){
        super();
    }


}