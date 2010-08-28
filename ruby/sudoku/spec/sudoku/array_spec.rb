require 'spec_helper'

describe Array do
  it "should know what values are filled" do
    [nil, 9, 8, nil, nil, nil, nil, 6, nil].present.should == [9, 8, 6]
  end
end
