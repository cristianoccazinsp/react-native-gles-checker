import { OS, NativeModules } from 'react-native';

const { GlesChecker } = NativeModules;

// Returns OpenGL ES version as a string
export default async function getGlesVersion(){
  if(OS.platform == 'android'){
    return await GlesChecker.getGlesVersion();
  }
  // dummy for now
  return "3";
}
