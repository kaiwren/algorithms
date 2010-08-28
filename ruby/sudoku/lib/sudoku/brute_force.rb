module BruteForce
  Available = (1..9).to_a.freeze
  
  def solve_without_timing!
    begin
      old_count = count
      fill_in_obvious_values!
    end while(old_count < count)
  end
  
  def fill_in_obvious_values!
    for i in 0..8
      for j in 0..8
        if !grid[i][j]
          possible = possible_values_for(i, j)
          grid[i][j] = possible.first if possible.size == 1
        end
      end
    end
  end
  
  def possible_values_for(i, j)
    Available - row(i).present - column(j).present - section(i, j).present
  end
end