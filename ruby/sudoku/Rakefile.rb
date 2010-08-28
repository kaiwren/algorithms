require 'rubygems'
gem 'rspec', '= 2.0.0.beta.19'
require 'rake'
require 'rspec'
require 'rspec/core/rake_task'

RSpec::Core::RakeTask.new(:default) do |task|
  task.pattern = 'spec/sudoku/**/*_spec.rb'
end
