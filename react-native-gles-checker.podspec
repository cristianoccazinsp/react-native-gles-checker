require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-gles-checker"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description  = package["description"]
  s.license      = "MIT"
  # s.license    = { :type => "MIT", :file => "FILE_LICENSE" }
  s.authors      = { "Cristiano" => "cristiano@zinspector.com" }
  s.platforms    = { :ios => "9.0", :tvos => "10.0" }
  s.source       = { :git => "https://github.com/cristianoccazinsp/react-native-gles-checker.git", :tag => "#{s.version}" }

  s.source_files = "ios/**/*.{h,m,swift}"
  s.requires_arc = true

  s.dependency "React"

  # s.dependency "..."
end

