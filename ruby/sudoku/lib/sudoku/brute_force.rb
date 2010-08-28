module BruteForce
  def solve_without_timing!
    available = (1..9).to_a
    for i in 0..8
      for j in 0..8
        if !grid[i][j]
          possible = available - row(i).present - column(j).present - section(i, j).present
          grid[i][j] = possible.first if possible.size == 1
        end
      end
    end
  end
end