package trc492.trcscoutingcodegen.commands.displays;

import java.io.IOException;
import java.util.List;

import trc492.trcscoutingcodegen.GeneratorUtil;
import trc492.trcscoutingcodegen.commands.Command;
import trc492.trcscoutingcodegen.data.Field;

public class CmdListFields extends Command
{
    private GeneratorUtil util;
    
    public CmdListFields(GeneratorUtil util)
    {
        super("fields", "Lists the current fields in the editor session.", "Usage: fields");
        this.util = util;
    }

    @Override
    public boolean call(List<String> args) throws IOException
    {
        if (!util.sessionLoaded())
        {
            System.out.println("No session loaded!");
            return false;
        }
        
        System.out.printf("%d Fields:\n", util.sessionData.fields.size());
        for (Field field : util.sessionData.fields)
        {
            System.out.println(field);
        }
        System.out.println("---");
        
        return true;
    }

}