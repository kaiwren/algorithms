module Sudoku
  class Grid
    attr_reader :grid

    def initialize(grid, algorithm = BruteForce)
      self.extend algorithm
      @grid = grid.clone
      raise 'This is not a 9x9 grid' unless nine_by_nine?
    end
    
    def solve!
      start_time = Time.now
      solve_without_timing!
      puts end_time = Time.now - start_time
      grid
    end
    
    def row(i)
      grid[i]
    end
    
    def column(i)
      grid.map{|r| r[i]}
    end
    
    def section(i, j)
      i += 1.0
      j += 1.0
      i /= 3
      j /= 3
      stop_row = i.ceil * 3 - 1
      stop_column = j.ceil * 3 - 1
      start_row = stop_row - 2
      start_column = stop_column - 2
      result = []
      for i in start_row..stop_row
        for j in start_column..stop_column
          result << grid[i][j]
        end
      end
      result
    end
    
    def filled?
      !grid.find{|row| row.include?(nil)}
    end
    
    def nine_by_nine?
      grid.size == 9 && !grid.find{|row| row.size != 9}
    end
    
    def solve_without_timing!
      # to be implemented by the algorithm
    end
  end
end
