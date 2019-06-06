USE [order-menu]
GO
/****** Object:  Table [dbo].[Table_menu]    Script Date: 2019/06/06 23:34:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_menu](
	[メニューID] [int] NOT NULL,
	[メニュー名] [varchar](50) NOT NULL,
	[在庫数] [int] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Table_menu] ([メニューID], [メニュー名], [在庫数]) VALUES (0, N'生協', 100)
INSERT [dbo].[Table_menu] ([メニューID], [メニュー名], [在庫数]) VALUES (1, N'A', 100)
INSERT [dbo].[Table_menu] ([メニューID], [メニュー名], [在庫数]) VALUES (2, N'B', 100)
INSERT [dbo].[Table_menu] ([メニューID], [メニュー名], [在庫数]) VALUES (3, N'C', 100)
