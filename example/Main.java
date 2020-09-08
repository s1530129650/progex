public class Main {public void FindTheFilesInPath(String path) throws Exception {
        File dir = new File(path);
        String[] children = dir.list();
        if (children == null) {
           System.out.println("Dir does not exist");
		}
        else {
			
			 for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            
        }

		System.out.println("Dir does not exist");
            }
        }
    }
