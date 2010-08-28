module Sudoku
  class Grid
    attr_reader :grid
    def initialize(grid)
      @grid = grid.clone
      raise 'This is not a 9x9 grid' unless nine_by_nine?
    end
    
    def solve!
      grid
    end
    
    def filled?
      !grid.find{|row| row.include?(nil)}
    end
    
    def nine_by_nine?
      grid.size == 9 && !grid.find{|row| row.size != 9}
    end
  end
end
